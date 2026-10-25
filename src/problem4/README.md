Problem 4 - Performance Comparison

1. Random Insertions/Deletions:
   Both ArrayList and LinkedList have O(n) complexity. ArrayList shifts elements, while LinkedList traverses nodes to reach the index. ArrayList can be faster due to better memory locality.

2. Sequential Insertions/Deletions:
   LinkedList is faster at the beginning (O(1)), while ArrayList requires shifting elements (O(n)). At the end, both are efficient with O(1) operations (amortized for ArrayList insertion).

3. Random Access:
   ArrayList is much faster (O(1)) because it directly accesses elements by index. LinkedList requires O(n) because it must traverse the nodes.

Conclusion:
ArrayList is better for random access, while LinkedList is better for frequent insertions and deletions at the beginning. For random insertions/deletions in the middle, ArrayList can be faster despite both having O(n) complexity.