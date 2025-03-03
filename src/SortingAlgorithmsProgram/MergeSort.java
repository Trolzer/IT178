package SortingAlgorithmsProgram;

import java.util.Arrays;

public class MergeSort {
    int[] numberList;

    public MergeSort(int[] numberList){
        this.numberList = numberList;
    }

    //helper method for printing elements
    public void printElements() {

        for (int number : numberList) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }


    public void merge(int[] origArr, int[] leftArr, int[] rightArr){
        int leftIndex = 0;
        int rightIndex = 0;
        int origIndex = 0;
        //sort until one of the half arrays has been sorted
        while (leftIndex < leftArr.length && rightIndex < rightArr.length){
            if (leftArr[leftIndex] <= rightArr[rightIndex]){
                origArr[origIndex] = leftArr[leftIndex];
                origIndex++;
                leftIndex++;
            } else {
                origArr[origIndex] = rightArr[rightIndex];
                origIndex++;
                rightIndex++;
            }
        }
        //put remaining half into main array
        while (leftIndex < leftArr.length) {
            origArr[origIndex] = leftArr[leftIndex];
            leftIndex++;
            origIndex++;
        }
        while (rightIndex < rightArr.length) {
            origArr[origIndex] = rightArr[rightIndex];
            rightIndex++;
            origIndex++;
        }
    }

    public void mergeSort(int[] arr){
        int len = arr.length;
        if (len < 2) {
            return;
        }
        int[] leftHalf = Arrays.copyOfRange(arr,0,len/2);
        int[] rightHalf = Arrays.copyOfRange(arr,len/2,len);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }
    //starter method for merge sort
    public void mergeSort(){
        mergeSort(numberList);
    }
}
