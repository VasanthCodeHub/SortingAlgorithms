import java.util.Arrays;

public class MergeSort {
    // Function to perform Merge Sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)  // Base case: If array has only one element, return it
            return arr;

        int mid = arr.length / 2; // Find the middle index

        // Recursively split the array into left and right halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted halves and return the result
        return merge(left, right);
    }

    // Function to merge two sorted arrays
    public static int[] merge(int[] first, int[] second) {
        int i = 0, j = 0, k = 0; // Pointers for first, second, and merged arrays
        int[] joined = new int[first.length + second.length];

        // Compare elements from both arrays and insert the smaller one
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                joined[k++] = first[i++];
            } else {
                joined[k++] = second[j++];
            }
        }

        // Copy any remaining elements from first array
        while (i < first.length) {
            joined[k++] = first[i++];
        }

        // Copy any remaining elements from second array
        while (j < second.length) {
            joined[k++] = second[j++];
        }

        return joined; // Return the merged sorted array
    }
}
   /* Time Complexity:
        Best case (already sorted):  𝑂(nlogn)

        Worst case (reverse sorted):  𝑂(nlogn)

        Average case:  𝑂(nlogn)
        // Space Complexity: O(n) due to the extra space required for copying arrays and merging.

        */