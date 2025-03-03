package SortingAlgorithmsProgram;

public class QuickSort {
    int[] numberList;

    public QuickSort(int[] numberList){
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
    public void swap(int[] arr, int index1, int index2){
        if (index1 == index2) {
            return; //skip swapping if both indexes are the same
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private int partition(int[] arr, int firstIndex, int lastIndex){
        int pivot = arr[lastIndex];
        int i = firstIndex-1;

        for (int j = firstIndex; j < lastIndex; j++){
            if (arr[j] <= pivot) { //if the element is less than the pivot swap it with the first unswapped index
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, lastIndex); //swap the pivot with the next unswapped index

        return i+1; //return end of partition/the last swapped index
    }

    public void sort(int[] arr, int firstIndex, int lastIndex){
        if (firstIndex < lastIndex){
            int partitionIndex = partition(arr,firstIndex,lastIndex); //get index of the partition

            sort(arr,firstIndex,partitionIndex-1); //left half
            sort(arr,partitionIndex+1,lastIndex);//right half
        }
    }

    //starter method for sort
    public void sort(){
        sort(numberList, 0, numberList.length-1);
    }
}
