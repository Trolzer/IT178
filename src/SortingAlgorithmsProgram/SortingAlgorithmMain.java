package SortingAlgorithmsProgram;

import java.util.Random;
import java.util.stream.IntStream;

public class SortingAlgorithmMain {

    public static void main(String[] args) {


        //100 int array
        int[] arrayInt100 = randomArray(10);

        BubbleSort bubbleSort = new BubbleSort(arrayInt100);
        SelectionSort selectionSort = new SelectionSort(arrayInt100);

        selectionSort.printElements();
        selectionSort.sort();
        selectionSort.printElements();

    }

    //helper method to generate random arrays range 0-1000
    public static int[] randomArray(int n){
        return new Random().ints(n,0,1001).toArray();
    }

}
