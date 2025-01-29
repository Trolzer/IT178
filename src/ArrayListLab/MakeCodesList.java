package ArrayListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeCodesList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numIter = 0;
        int i;
        /* Variable declarations go here */
        try {
            numIter = Integer.parseInt(scnr.next());
        }catch (NumberFormatException e){
            System.out.println("invalid input, defaulting to 0");
        }
        if (numIter < 0){
            numIter = 0;
            System.out.println("negative input, defaulting to 0");
        }
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
