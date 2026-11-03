# Code Quality Review & DSA Bug Analysis

This document provides a comprehensive code review of the 90 Java source files in the repository. Each issue is documented with the exact file location, root cause analysis, why it is problematic, and the recommended senior-level correction.

---

## 1. Critical Runtime & Logical Bugs

### 1.1 `Sorting/Quick_Sort.java`
* **Category**: Critical Logic Bug & Runtime Exception
* **Location**: Lines 16, 26
  ```java
  int pivot = arr[high];
  // ...
  obj.swap_arr(arr, pivot, i);
  ```
* **Why It Is Incorrect**:
  `pivot` holds the **value** of the element at `arr[high]`, not an array index. Passing `pivot` to `swap_arr(arr, pivot, i)` causes `ArrayIndexOutOfBoundsException` whenever `pivot >= arr.length` or `pivot < 0`. Additionally, standard Lomuto partitioning requires swapping index `i + 1` with index `high`.
* **Note**: In `dsa_telusko/Quick_Sort.java`, the student implemented this correctly using inline swapping:
  ```java
  int t = arr[i+1];
  arr[i+1] = arr[high];
  arr[high] = t;
  ```
* **Suggested Correction**:
  Replace line 26 with:
  ```java
  obj.swap_arr(arr, i + 1, high);
  return i + 1;
  ```

---

### 1.2 `dsa_telusko/Stack_Linked_List.java`
* **Category**: Compilation Failure (Incomplete Implementation)
* **Location**: Lines 11–18, 24–26
  ```java
  public boolean isempty() {
  }
  public boolean isfull() {
  }
  ```
* **Why It Is Incorrect**:
  Methods declaring a `boolean` return type have empty bodies with no return statements, causing compiler error: `missing return statement`. The outer class `Stack_Linked_List` is also an empty stub without a `main` method.
* **Suggested Correction**:
  ```java
  public boolean isempty() {
      return top == null;
  }
  public boolean isfull() {
      return false; // Linked list stack has dynamic capacity
  }
  ```

---

### 1.3 `Basic_Maths/hashing.java`
* **Category**: Memory Allocation Bug (`OutOfMemoryError`)
* **Location**: Line 13
  ```java
  int hash[] = new int[1000000001];
  ```
* **Why It Is Incorrect**:
  Allocating an array of $10^9 + 1$ integers requires approximately 4 GB of contiguous heap memory. Running this program will crash the JVM with `java.lang.OutOfMemoryError: Java heap space` (or `Requested array size exceeds VM limit`) under standard JVM memory limits.
* **Suggested Correction**:
  Use `HashMap<Integer, Integer>` (as done in `Arrays/best_count_ele_arr.java`):
  ```java
  Map<Integer, Integer> map = new HashMap<>();
  for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
  }
  ```

---

### 1.4 `Arrays/brute_2sum.java`
* **Category**: Logical Bug (False Positive on Target)
* **Location**: Line 18
  ```java
  for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
          if(arr[i] + arr[j] == target) { ... }
      }
  }
  ```
* **Why It Is Incorrect**:
  When `j == i`, the algorithm pairs the element with itself (`arr[i] + arr[i] == target`). If `arr = [3]` and `target = 6`, the algorithm returns `true`, which violates the standard Two Sum constraint requiring two distinct element indices.
* **Suggested Correction**:
  Start the inner loop at `j = i + 1`:
  ```java
  for(int j = i + 1; j < n; j++)
  ```

---

### 1.5 `Arrays/optimal_union_of_sorted_arr.java`
* **Category**: Runtime `IndexOutOfBoundsException`
* **Location**: Lines 36, 45
  ```java
  while(i < n1) {
      if(list.get(list.size()-1) != arr1[i]) {
          list.add(arr1[i]);
      }
      i++;
  }
  ```
* **Why It Is Incorrect**:
  In the initial loop (lines 16, 22, 28), the code correctly guards with `list.isEmpty() || list.get(...) != ...`. However, in the two trailing cleanup loops, `list.isEmpty()` check is omitted. If the first array is empty (`n1 == 0`), `list` is empty when reaching the second trailing loop, causing `list.get(-1)` to throw `IndexOutOfBoundsException`.
* **Suggested Correction**:
  ```java
  while(i < n1) {
      if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
          list.add(arr1[i]);
      }
      i++;
  }
  while(j < n2) {
      if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
          list.add(arr2[j]);
      }
      j++;
  }
  ```

---

### 1.6 `Arrays/move_zeros_to_end.java`
* **Category**: Logical Bug on Arrays Without Zeros
* **Location**: Lines 13–29
  ```java
  int j = 0;
  for(int i = 0; i < n; i++) {
      if(arr[i] == 0) { j = i; break; }
  }
  for(int i = j + 1; i < n; i++) {
      if(arr[i] != 0) {
          swap_arr.swap(arr, i, j);
          j++;
      }
  }
  ```
* **Why It Is Incorrect**:
  If the input contains no zeros (e.g. `[1, 2, 3]`), the break condition is never reached and `j` remains `0`. The second loop then inappropriately starts swapping non-zero elements (`swap(arr, 1, 0)`), corrupting the ordering of an array that had no zeros.
* **Suggested Correction**:
  ```java
  int j = -1;
  for(int i = 0; i < n; i++) {
      if(arr[i] == 0) { j = i; break; }
  }
  if(j == -1) return; // No zeros found; array already satisfied
  ```

---

### 1.7 `Arrays/array_sorted_check.java`
* **Category**: Control Flow / Duplicate Console Output
* **Location**: Line 13–14
  ```java
  if(n == 1)
      System.out.println("Sorted");
  ```
* **Why It Is Incorrect**:
  Missing a `return;` statement. Execution proceeds down to line 28, where `istrue` remains `true`, causing `"Sorted"` to be printed twice for $n = 1$.
* **Suggested Correction**:
  ```java
  if(n <= 1) {
      System.out.println("Sorted");
      return;
  }
  ```

---

### 1.8 `dsa_telusko/Queue.java`
* **Category**: Circular Queue Index Overflow & Display Bug
* **Location**: Line 29, 50
  ```java
  // In dequeue():
  front++;
  // In show():
  for(int i = front; i < n; i++) { System.out.print(arr[i] + " "); }
  ```
* **Why It Is Incorrect**:
  1. While `enqueue()` uses modulo arithmetic `rear = (rear + 1) % n`, `dequeue()` simply increments `front++`. Over repeated operations, `front` exceeds `n - 1`, causing `ArrayIndexOutOfBoundsException` on `peek()`.
  2. `show()` iterates from `front` to `n - 1`, completely missing items that wrapped around from `0` to `rear`.
* **Suggested Correction**:
  In `dequeue()`:
  ```java
  front = (front + 1) % n;
  size--;
  ```
  In `show()`:
  ```java
  for(int i = 0; i < size; i++) {
      System.out.print(arr[(front + i) % n] + " ");
  }
  System.out.println();
  ```

---

### 1.9 `dsa_telusko/Linked_List.java`
* **Category**: `NullPointerException` on Empty List Operations
* **Location**: Lines 20–32
  ```java
  public void insert_at_first(int data) {
      Node newnode = new Node(data);
      Node temp = Head;
      Head = newnode;
      Head.next = temp;
  }
  ```
* **Why It Is Incorrect**:
  If `insert_at_first` is called on an empty list, `Head` is updated but `Tail` remains `null`. A subsequent call to `insert_at_end()` performs `Tail.next = newnode`, throwing `NullPointerException`.
* **Suggested Correction**:
  ```java
  public void insert_at_first(int data) {
      Node newnode = new Node(data);
      if(Head == null) {
          Head = newnode;
          Tail = newnode;
          return;
      }
      newnode.next = Head;
      Head = newnode;
  }
  ```

---

## 2. Edge Case & Numeric Overflow Considerations

### 2.1 `Arrays/largest_ele_arr.java`
* **Location**: Line 9
* **Issue**: `int max = 0;` fails when all array elements are negative (e.g. `[-5, -12, -3]`), returning `0` instead of `-3`.
* **Correction**: Initialize `max = Integer.MIN_VALUE;` or `max = arr[0];`.

### 2.2 `Arrays/sec_large_small_arr.java`
* **Location**: Lines 11–12
* **Issue**: Initializing `sec_max = 0` and `sec_min = 0` fails for negative arrays or arrays with duplicate values (e.g., `[5, 5, 5]`).
* **Correction**: Initialize `sec_max = Integer.MIN_VALUE;` and `sec_min = Integer.MAX_VALUE;`.

### 2.3 `Arrays/optimal_missing_num_arr.java`
* **Location**: Line 19
  ```java
  long expected_sum = n * (n + 1) / 2;
  ```
* **Issue**: Because `n` is an `int`, the product `n * (n + 1)` is computed in 32-bit arithmetic before assigning to `long`. For $n \ge 46,341$, this overflows into negative values.
* **Correction**: Cast to `long` before multiplying:
  ```java
  long expected_sum = (long) n * (n + 1) / 2;
  ```

### 2.4 `Basic_Maths/count_digits.java`
* **Location**: Line 8
* **Issue**: `while (n > 0)` returns `count = 0` when $n = 0$, but the number `0` has 1 digit.
* **Correction**: Handle `if (n == 0) { System.out.println(1); return; }`.

### 2.5 `Basic_Maths/fibonacci.java`
* **Location**: Lines 21–29
* **Issue**: Prints `first` and `second_first` (`0 1`), and then loops $i = 1$ to $n$, printing $n + 2$ terms in total instead of $n$ terms.
* **Correction**: Adjust the loop condition to print exactly $n$ terms.

---

## 3. Pattern Dimension Hardcoding

### 3.1 `Patterns/pattern18.java` & `Patterns/pattern20.java`
* **Location**: Line 11 in `pattern18.java` (`if (i > 4)`), Line 9 in `pattern20.java` (`if (i > 5)`)
* **Issue**: The threshold numbers `4` and `5` are hardcoded for $n = 5$. Running these with $n = 3, 4, 7$ breaks symmetry.
* **Correction**: Use dynamic boundaries: `if (i >= n)`.

### 3.2 `Patterns/pattern19.java`
* **Location**: Line 9
  ```java
  for(char ch = (char)('E' - i); ch <= 'E'; ch++)
  ```
* **Issue**: Character `'E'` is hardcoded for $n = 5$. Inputs larger than 5 cause non-alphabetic ASCII characters to print.
* **Correction**: Compute starting character dynamically: `(char)('A' + n - 1 - i)`.

---

## 4. Package Coupling & Inter-file Dependencies

### 4.1 `package medium;` in `Arrays/`
* Exactly 10 files in `Arrays/` declare `package medium;`:
  - `better_2sum.java`, `Better_Long_subarr_sumk.java`, `better_sort_012.java`
  - `brute_2sum.java`, `Brute_Long_subarr_sumk.java`, `brute_sort_012.java`
  - `Merge_Sort.java`, `optimal_2sum.java`, `optimal_Long_subarr_sumk.java`, `optimal_sort_012.java`
* The rest of the 80 files use default packages. `brute_sort_012.java` specifically calls `Merge_Sort.merge_sort(...)`, requiring both to reside in the same package structure.

### 4.2 Cross-file Helper Classes
* `Arrays/swap_arr.java` and `Arrays/print_arr.java` are referenced by `Arrays/arr_ro_k_times.java`, `Arrays/leader_arr.java`, `Arrays/move_zeros_to_end.java`, and `Arrays/next_permutation.java`.
* `Sorting/Swap.java` is referenced by `Sorting/Bubble_Sort.java` and `Sorting/Quick_Sort.java`.
* `Recursion/recursion.java` defines an embedded class `reverse_array` that attempts to call `swap_arr` and `print_arr` (which reside in `Arrays/`). Standalone compilation of `Recursion/recursion.java` requires resolving this cross-folder dependency.

