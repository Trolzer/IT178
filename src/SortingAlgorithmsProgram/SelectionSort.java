package SortingAlgorithmsProgram;

public class SelectionSort {

    private int[] numberList;

    public SelectionSort(int[] numberList) {

        this.numberList = numberList;
    }

    //helper method for printing elements
    public void printElements() {

        for (int number : numberList) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    //helper method for swapping elements
    public void swap(int index1, int index2) {

        if (index1 == index2) {
            return; //skip swapping if both indexes are the same
        }
        int temp = numberList[index1];
        numberList[index1] = numberList[index2];
        numberList[index2] = temp;
    }

    //selection sort implementation
    public void sort() {

        int minimumIndex = 0;
        int unsortedIndex = 0;
        for (int i = 0; i <= numberList.length - 1; i++) {
            for (int j = unsortedIndex; j <= numberList.length - 1; j++) {
                if (numberList[j] < numberList[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            swap(minimumIndex, unsortedIndex);
            unsortedIndex++;
            minimumIndex = unsortedIndex;
        }
    }

}
