package LearnInterface;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {1, 3, 0, 4, 2, 7, 8, 5};
        System.out.println("\ninsertion sort");
        insertionSort.printArray(insertionSort.sortASC(arr));
        System.out.println();
        insertionSort.printArray(insertionSort.sortDESC(arr));
        System.out.println("\nselection sort");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.printArray(insertionSort.sortASC(arr));
        System.out.println();
        selectionSort.printArray(insertionSort.sortDESC(arr));
    }
}
