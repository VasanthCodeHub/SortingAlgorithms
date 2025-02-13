public class SelectionSort {
    // Method to perform Selection Sort on the input array
    public static int[] selectionSort(int[] arr) {
        int length = arr.length; // Get the length of the array

        // Outer loop to iterate over each element in the array
        for (int i = 0; i < length-1; i++) {
            int minIndex = i; // Assume the current index is the minimum

            // Inner loop to find the minimum element in the unsorted portion
            for (int j = i + 1; j < length; j++) {
                if (arr[minIndex] > arr[j]) { // If a smaller element is found
                    minIndex = j; // Update the minIndex
                }
            }

            // Swap the found minimum element with the current element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
// Space Complexity: O(1) (Only a few extra variables are used, no extra arrays)
        return arr; // Return the sorted array
    }
}
    /*Explanation of Selection Sort Algorithm:

        The outer loop (for i) iterates through the array from the first to the last element.
        We assume the current element (arr[i]) is the smallest.
        The inner loop (for j) searches for the smallest element in the unsorted part of the array.
        If a smaller element is found, update minIndex to the new smallest element's index.
        After the inner loop completes, swap the smallest found element (arr[minIndex]) with the current element (arr[i]).
        This process continues until the array is fully sorted.

        Time Complexity:
        Best case (already sorted):  𝑂(𝑛^2)

        Worst case (reverse sorted):  𝑂(𝑛^2)

        Average case:  𝑂(𝑛^2)

       */

