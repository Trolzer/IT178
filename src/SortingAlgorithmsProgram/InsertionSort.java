package SortingAlgorithmsProgram;

public class InsertionSort {

    private int[] numberList;

    public InsertionSort(int[] numberList) {

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
    public void swap(int index1, int index2){
        if (index1 == index2) {
            return; //skip swapping if both indexes are the same
        }
        int temp = numberList[index1];
        numberList[index1] = numberList[index2];
        numberList[index2] = temp;
    }

    public void sort(){
        int arrLength = numberList.length;
        for (int i = 1; i < arrLength; i++){ //start at 1 so the first element is "sorted"
            int currElementIndex = i;
            for (int j = i; j > 0; j--){ //compare from current element until start of array or sorted
                if (numberList[currElementIndex] < numberList[j-1]){
                    swap(currElementIndex,j-1);
                    currElementIndex--;
                }else {
                    break;
                }
            }
        }
    }

}
