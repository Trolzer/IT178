package SortingAlgorithmsProgram;

import javax.crypto.Cipher;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class SortingAlgorithmMain {

    public static void main(String[] args) {


            //100,1000,10000 random int arrays
            int[] arrayInt100 = randomArray(100);
            int[] arrayInt1000 = randomArray(1000);
            int[] arrayInt10000 = randomArray(10000);

            //100,1000,10000 random int arrays sorted
            int[] arrayInt100Sorted = Arrays.copyOf(arrayInt100,100);
            Arrays.sort(arrayInt100Sorted);
            int[] arrayInt1000Sorted = Arrays.copyOf(arrayInt1000,1000);
            Arrays.sort(arrayInt1000Sorted);
            int[] arrayInt10000Sorted = Arrays.copyOf(arrayInt10000, 10000);
            Arrays.sort(arrayInt10000Sorted);


        //sort timing
            testSorts(arrayInt100);
            testSorts(arrayInt1000);
            testSorts(arrayInt10000);

            //test with sorted arrays
            System.out.println("------------SORTED ARRAY TEST------------");
            testSorts(arrayInt100Sorted);
            testSorts(arrayInt1000Sorted);
            testSorts(arrayInt10000Sorted);



    }

    //helper method to generate random arrays range 0-1000
    public static int[] randomArray(int n){
        return new Random().ints(n,0,1001).toArray();
    }

    //helper for timing sorts
    public static void testSorts(int[] arr){
        BubbleSort bubbleSort = new BubbleSort(arr);
        InsertionSort insertionSort = new InsertionSort(arr);
        MergeSort mergeSort = new MergeSort(arr);
        QuickSort quickSort = new QuickSort(arr);
        SelectionSort selectionSort = new SelectionSort(arr);

        long startTime = System.nanoTime();
        bubbleSort.sort();
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort " + arr.length + ": " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        insertionSort.sort();
        endTime = System.nanoTime();
        System.out.println("Insertion Sort " + arr.length + ": " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        mergeSort.mergeSort();
        endTime = System.nanoTime();
        System.out.println("Merge Sort " + arr.length + ": " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        quickSort.sort();
        endTime = System.nanoTime();
        System.out.println("Quick Sort " + arr.length + ": " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        selectionSort.sort();
        endTime = System.nanoTime();
        System.out.println("Selection Sort " + arr.length + ": " + (endTime - startTime) + "ns" + "\n");




    }
}
