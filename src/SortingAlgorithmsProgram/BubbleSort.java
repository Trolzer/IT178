package SortingAlgorithmsProgram;



public class BubbleSort {

    private int[] numberList;

    public BubbleSort(int[] numberList){
        this.numberList = numberList;
    }

    //helper method for printing elements
    public void printElements(){
        for (int number : numberList){
            System.out.print(number+ ", ");
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

    //BubbleSort implementation
    public void sort(){
        boolean valueSwapped = true;
        int lastUnsortedIndex = numberList.length-1;
        int currUnsortedIndex = lastUnsortedIndex;
        while (valueSwapped) {
            valueSwapped = false;
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (numberList[i] > numberList[i+1]){
                    swap(i,i+1);
                    currUnsortedIndex = i;
                    valueSwapped = true;
                }
            }
            lastUnsortedIndex = currUnsortedIndex;
        }
    }


}
