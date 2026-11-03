# Java DSA Practice

A clean, honest, and structured repository containing my personal Data Structures and Algorithms (DSA) practice in **Java**. 

I am a second-year B.Tech Information Technology student, and this repository documents my day-to-day progress, algorithm implementations, problem-solving techniques, and foundational computer science concepts as I learn them.

---

## About the Repository

This repository serves as an authentic record of my DSA learning journey. It preserves my original implementations—ranging from introductory pattern generation and mathematical algorithms to fundamental data structures and multi-approach array problems (Brute Force, Better, and Optimal solutions).

Rather than showcasing copy-pasted or artificially polished code, this repository reflects genuine student progress, code evolutions, and self-reviews.

---

## Development Environment & Tech Stack

* **Programming Language**: Java (Java SE)
* **Target Runtime / Compiler**: OpenJDK / Oracle JDK 25 LTS (Compatible with JDK 11, 17, 21+)
* **Build / Execution**: Standard Java CLI (`javac`, `java`)
* **Operating System**: Windows 11
* **Primary Reference / Syllabus**: Striver's A2Z DSA Sheet & Telusko DSA Series

---

## Repository Structure

```text
Java-DSA-Practice/
│
├── Patterns/                 # 22 Geometric, numeric, and character pattern problems
│   ├── pattern1.java ... pattern22.java
│
├── Basic_Maths/              # Mathematical algorithms & number theory
│   ├── Amstrong_num.java
│   ├── count_digits.java
│   ├── factorial.java
│   ├── fibonacci.java
│   ├── gcd.java
│   ├── hashing.java
│   ├── pallindrome_num.java
│   ├── prime_num_check.java
│   ├── print_all_divisors.java
│   └── String_pallindrome.java
│
├── Recursion/                # Basic recursion & recursive sorting
│   ├── name_recursion.java
│   ├── print_1_to_N.java
│   ├── print_N_to_1.java
│   ├── recursion.java
│   ├── rec_bubble_sort.java
│   ├── rec_insertion_sort.java
│   ├── reverse_num.java
│   └── sum_recursion.java
│
├── Sorting/                  # Fundamental comparison-based sorting algorithms
│   ├── Bineary_Search.java
│   ├── Bubble_Sort.java
│   ├── Insertion_Sort.java
│   ├── Merge_Sort.java
│   ├── Quick_Sort.java
│   ├── Selection_Sort.java
│   └── Swap.java
│
├── Arrays/                   # Array manipulations & multi-approach problems
│   ├── appear_once_arr.java & optimal_appear_once_arr.java
│   ├── array_sorted_check.java
│   ├── arr_ro_k_times.java & left_arr_ro1.java
│   ├── best_count_ele_arr.java & count_ele_arr.java & high_low_ele_arr.java
│   ├── brute_2sum.java & better_2sum.java & optimal_2sum.java
│   ├── brute_sort_012.java & better_sort_012.java & optimal_sort_012.java
│   ├── Brute_Long_subarr_sumk.java & Better_Long_subarr_sumk.java & optimal_Long_subarr_sumk.java
│   ├── largest_ele_arr.java & sec_large_small_arr.java & leader_arr.java
│   ├── move_zeros_to_end.java & reverse_array.java
│   ├── next_permutation.java & Permutation.java
│   ├── optimal_intersection_of_sorted_arr.java & optimal_union_of_sorted_arr.java & union_of_sorted_arr.java
│   ├── optimal_max_cons_1_arr.java & optimal_missing_num_arr.java
│   └── print_arr.java & swap_arr.java
│
├── dsa_telusko/              # Data structures and algorithms from Telusko course
│   ├── Linear_Search.java & Bineary_Search.java
│   ├── Bubble_Sort.java & Insertion_Sort.java & Selection_Sort.java
│   ├── Merge_Sort.java & Quick_Sort.java
│   ├── Linked_List.java
│   ├── Queue.java
│   ├── Stack_array.java
│   └── Stack_Linked_List.java
│
├── .gitignore                # Excludes .class bytecode, crash logs, and IDE caches
├── BUILD_REPORT.md           # Standalone & coupled compilation verification
├── PROGRESS.md               # Detailed progress tracker and learning roadmap
├── REVIEW_NOTES.md           # In-depth code review, edge case analysis, and bug notes
└── README.md                 # Project overview and documentation
```

---

## Problem-Solving Approaches

Whenever solving standard algorithmic problems, I practice developing multiple solutions to understand the trade-offs in time and space complexity:

### 1. Brute Force
* Focuses on reaching a working solution using straightforward iteration or exhaustive search.
* Example: `Arrays/brute_2sum.java` using nested loops ($O(N^2)$), `Arrays/Brute_Long_subarr_sumk.java` checking all subarrays ($O(N^2)$).

### 2. Better
* Improves performance by introducing auxiliary data structures (e.g., `HashMap`, `HashSet`, frequency arrays) or sorting.
* Example: `Arrays/better_2sum.java` using two pointers on a sorted array ($O(N \log N)$), `Arrays/Better_Long_subarr_sumk.java` using prefix sums and HashMap ($O(N)$ time, $O(N)$ space).

### 3. Optimal
* Minimizes time and auxiliary space complexity through mathematical properties, two pointers, sliding windows, bit manipulation, or in-place transformations.
* Example:
  * `Arrays/optimal_sort_012.java`: Dutch National Flag algorithm ($O(N)$ one-pass, $O(1)$ space).
  * `Arrays/optimal_appear_once_arr.java`: Bitwise XOR cancellation ($O(N)$ time, $O(1)$ space).
  * `Arrays/optimal_Long_subarr_sumk.java`: Two-pointer sliding window ($O(2N)$ time, $O(1)$ space).

---

## How to Compile & Run Programs

The programs in this repository are standalone console applications that read input from `System.in` using `java.util.Scanner`.

### 1. Prerequisites
Ensure the Java Development Kit (JDK 11 or higher) is installed:
```bash
javac -version
java -version
```

### 2. Compiling Standalone Files
Navigate to the root directory and compile any standalone file:
```bash
# Example: Running Pattern 22
javac Patterns/pattern22.java
java Patterns.pattern22
```

### 3. Compiling Files with Local Helpers
Some files in `Arrays/` and `Sorting/` share local helper utilities (`swap_arr.java`, `print_arr.java`, `Swap.java`). Compile them together:
```bash
# Example: Compiling Array Rotation with swap helper
javac Arrays/arr_ro_k_times.java Arrays/swap_arr.java
java Arrays.arr_ro_k_times
```

### 4. Compiling Files with Package Declarations
Files containing `package medium;` should be compiled specifying the output directory:
```bash
javac -d . Arrays/Merge_Sort.java Arrays/brute_sort_012.java
java medium.brute_sort_012
```

---

## Learning Objectives

1. Build a strong foundation in core Data Structures (Arrays, Linked Lists, Stacks, Queues, Trees, Graphs).
2. Master algorithmic patterns (Two Pointers, Sliding Window, Divide & Conquer, Fast & Slow Pointers).
3. Develop the ability to analyze Time and Space Complexity ($O(1)$, $O(\log N)$, $O(N)$, $O(N \log N)$, $O(N^2)$).
4. Write clean, idiomatic Java code following standard naming conventions and object-oriented principles.
5. Prepare for technical interviews and competitive programming challenges.

---

## Learning Progress & Summary

* **Total Java Source Files**: 90
* **Current Status**:
  * **Practised**: Patterns (22/22), Basic Maths (10/10), Recursion Basics (8/8), Sorting Algorithms (7/7), Arrays (32/32), Two Pointers, Hashing.
  * **In Progress**: Linked Lists, Stacks & Queues, Binary Search, Strings, Bit Manipulation.
  * **Not Started**: Trees, Heaps, Graphs, Greedy, Dynamic Programming, Tries.

For the full breakdown and problem inventory, see [PROGRESS.md](file:///c:/Users/abile/Desktop/Codes/DSA/PROGRESS.md).  
For the detailed compilation audit, see [BUILD_REPORT.md](file:///c:/Users/abile/Desktop/Codes/DSA/BUILD_REPORT.md).  
For identified bugs, edge case discussions, and suggested corrections, see [REVIEW_NOTES.md](file:///c:/Users/abile/Desktop/Codes/DSA/REVIEW_NOTES.md).

---

## Future Roadmap

- [ ] Complete Linked List implementations (Doubly Linked List, Cycle Detection, Reversal)
- [ ] Implement Monotonic Stacks and Queue problem sets (Valid Parentheses, Next Greater Element)
- [ ] Advanced Binary Search (Rotated Arrays, Search on Answer space)
- [ ] String Manipulation algorithms (KMP, Rabin-Karp, Anagrams)
- [ ] Recursion & Backtracking (Subsets, Combinations, Permutations, N-Queens)
- [ ] Trees and Binary Search Trees (Traversals, LCA, Balanced Trees)
- [ ] Heaps and Priority Queues
- [ ] Graph Theory (BFS, DFS, Dijkstra, Bellman-Ford, Disjoint Set Union)
- [ ] Dynamic Programming (1D, 2D, Grids, Subsets, Strings)

