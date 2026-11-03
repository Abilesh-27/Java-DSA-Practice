# Compilation & Build Report

This report documents the verification, build configuration, and compilation health of all 90 Java source files across the repository.

---

## 1. Executive Summary

| Metric | Count | Details |
| :--- | :---: | :--- |
| **Total Java Files** | **90** | Preserved from original repository |
| **Isolated Standalone Compilations Passing** | **80** | Compile with no external or sibling dependencies |
| **Sibling-Coupled Compilations Passing** | **8** | Compile successfully alongside local helper classes |
| **Cross-Folder Dependency Issues** | **1** | `Recursion/recursion.java` requires `Arrays` helper classes |
| **Strict Compilation Failures** | **1** | `dsa_telusko/Stack_Linked_List.java` (incomplete stub) |
| **Programs Requiring Interactive Input (`Scanner`)** | **85** | Expect input via `System.in` |
| **Helper Classes Without `main` Method** | **4** | Pure utility classes / stubs |
| **Generated `.class` Artifacts in Repo** | **0** | Cleaned and excluded via `.gitignore` |

---

## 2. Compilation Breakdown by Directory

### 2.1 Patterns (`Patterns/`)
* **File Count**: 22 files (`pattern1.java` to `pattern22.java`)
* **Compilation Result**: **22 / 22 Passed (100%)**
* **Input Model**: All 22 files require user input via `java.util.Scanner` (dimension $n$).
* **Notes**: Completely self-contained, standalone classes.

### 2.2 Basic Maths (`Basic_Maths/`)
* **File Count**: 10 files
* **Compilation Result**: **10 / 10 Passed (100%)**
* **Input Model**: All 10 files require interactive input via `Scanner`.
* **Runtime Warnings**:
  - `hashing.java` compiles cleanly but triggers `OutOfMemoryError` at runtime due to `new int[1000000001]`.

### 2.3 Recursion (`Recursion/`)
* **File Count**: 8 files
* **Compilation Result**:
  - **Standalone**: 6 / 8 Passed
  - **Coupled**: 7 / 8 Passed
* **Status**:
  - `rec_insertion_sort.java` requires `recursion.java` on the classpath (`new recursion()` instantiation).
  - `recursion.java` contains a non-public helper class `reverse_array` that calls `swap_arr.swap()` and `print_arr.printArr()`. These helper classes exist in `Arrays/`, so standalone compilation without classpath linkage fails with `cannot find symbol`.

### 2.4 Sorting (`Sorting/`)
* **File Count**: 7 files
* **Compilation Result**:
  - **Standalone**: 4 / 7 Passed (`Bineary_Search.java`, `Insertion_Sort.java`, `Merge_Sort.java`, `Swap.java`)
  - **Coupled with `Swap.java`**: **7 / 7 Passed (100%)**
* **Dependencies**: `Bubble_Sort.java` and `Quick_Sort.java` rely on `Swap.java` for swapping operations.
* **Runtime Warning**: `Quick_Sort.java` compiles cleanly but has a logical runtime bug in `partition()` (passes `pivot` value instead of index `high` to `swap_arr`).

### 2.5 Arrays (`Arrays/`)
* **File Count**: 32 files
* **Compilation Result**:
  - **Standalone**: 27 / 32 Passed
  - **Coupled**: **32 / 32 Passed (100%)**
* **Dependencies**:
  - `arr_ro_k_times.java`, `move_zeros_to_end.java`, `next_permutation.java` depend on `swap_arr.java`.
  - `leader_arr.java` depends on `print_arr.java`.
  - `brute_sort_012.java` depends on `Merge_Sort.java` under `package medium;`.
* **Package Context**: 10 files in `Arrays/` declare `package medium;`. When compiled together or within the package directory, all 10 compile with zero errors.

### 2.6 Telusko Course Series (`dsa_telusko/`)
* **File Count**: 11 files
* **Compilation Result**: **10 / 11 Passed**
* **Failures**:
  - `Stack_Linked_List.java`: **FAILED**
    - `error: missing return statement` at lines 14 and 18 (`isempty()` and `isfull()`).
    - This file is an incomplete implementation stub without a `main` method.

---

## 3. Inventory of Classes Without a `main` Method

The following 4 files are utility / helper definitions or incomplete stubs and do not serve as standalone entry points:

1. `Arrays/print_arr.java`: Static utility class providing `printArr(int[] arr)`.
2. `Arrays/swap_arr.java`: Static utility class providing `swap(int[] arr, int i, int j)`.
3. `Sorting/Swap.java`: Utility class providing `swap_arr(int[] arr, int i, int j)`.
4. `dsa_telusko/Stack_Linked_List.java`: Unfinished class stub.

---

## 4. How to Compile Correctly

Because this repository contains standalone educational exercises, files should be compiled individually or with their local directory on the classpath:

### Single Standalone Program
```bash
javac Patterns/pattern1.java
java Patterns/pattern1
```

### Program with Local Helpers (e.g. `Arrays` or `Sorting`)
```bash
# Example for Sorting with Swap helper:
javac -cp Sorting Sorting/Bubble_Sort.java Sorting/Swap.java
java -cp Sorting Bubble_Sort

# Example for Arrays with swap_arr / print_arr:
javac -cp Arrays Arrays/arr_ro_k_times.java Arrays/swap_arr.java
java -cp Arrays arr_ro_k_times
```

### Programs with `package medium;`
```bash
javac -d . Arrays/Merge_Sort.java Arrays/brute_sort_012.java
java medium.brute_sort_012
```

---

## 5. Clean Workspace Verification

All generated `.class` bytecode binaries and JVM crash dump logs (`hs_err_pid*.log`) have been removed from the repository to maintain a pristine source-only workspace. The `.gitignore` has been configured to prevent accidental commits of binary files.

