package LearnInterface;

public class InsertionSort implements ISortArray {
    @Override
    public int[] sortASC(int[] array) {
        int size = array.length;
        int temp;
        int i, j;
        for (i = 1; i < size; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    @Override
    public int[] sortDESC(int[] array) {
        int size = array.length;
        int i, j;
        int temp;
        for (i = 1; i < size; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int v : array) {
            System.out.print(v + " ");
        }
    }
}
