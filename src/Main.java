import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        arr =  SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        arr = InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}