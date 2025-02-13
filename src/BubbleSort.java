public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int length = arr.length; // Get the length of the array

        // Outer loop runs for (n - 1) passes
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false; // To track if any swaps happen in this pass

            // Inner loop for pairwise comparisons
            for (int j = 0; j < length - i - 1; j++) {
                // Time Complexity: O(n^2) in the worst and average case (nested loop)
                // Best case: O(n) when the array is already sorted (due to 'swapped' flag)
                if (arr[j] > arr[j + 1]) { // Swap if elements are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }

            // If no swaps occurred, the array is already sorted -> Best case O(n)
            if (!swapped) {
                break;
            }
        }

        // Space Complexity: O(1) (Only a few extra variables are used, no extra arrays)
        return arr; // Return the sorted array
    }
}
