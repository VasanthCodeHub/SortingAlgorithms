public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;  // j should be the previous index

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift elements to the right
                j--;
            }
            arr[j + 1] = key;  // Place key at the correct position
        }
        return arr;
    }
}
/*
   Time Complexity:
        Best case (already sorted):  O(n)
        Worst case (reverse sorted): O(n^2)
        Average case: O(n^2)

   Space Complexity: O(1) (in-place sorting)
*/
