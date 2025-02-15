public class QuickSort {
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return arr;

        int start = low;
        int end = high;
        int pivot = arr[(start + end) / 2]; // Corrected pivot selection

        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);

        return arr;
    }
}

/*
Time Complexity Analysis:
- Best Case: O(n log n) (When partitioning is balanced)
- Average Case: O(n log n)
- Worst Case: O(n^2) (When the smallest or largest element is always chosen as the pivot, leading to unbalanced partitions)

Space Complexity: O(log n) (Recursive call stack depth in the best case, O(n) in the worst case)
*/
