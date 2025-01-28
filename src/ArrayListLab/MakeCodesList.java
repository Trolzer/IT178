package ArrayListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeCodesList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numIter;
        int i;
        /* Variable declarations go here */
        numIter = scnr.nextInt();
        ArrayList<Character> codesList = new ArrayList<Character>();
        /* Your code goes here */
        for (i = 0; i < numIter; i++){
            codesList.add('M');
            codesList.add('C');
        }

// Traversing a list using indexes
        for (i = 0; i < codesList.size(); ++i) {
            System.out.print(codesList.get(i) + " ");
        }
        System.out.println();
    }
}
