package RecursionProgram;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("Enter a string to check if it's a palindrome:");
        String word = scan.nextLine();
        System.out.println("Output:");
        if (isPalindrome(word, 0, word.length())){
            System.out.println(word + " is a palindrome!");
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } else if (word.substring(start, start + 1).equals(word.substring(end))) {
            isPalindrome(word, start + 1, end + 1);
        }
        return false;
    }


    public void cleanString(String str) {
        str = str.replaceAll("[0-9]", "");
        str = str.toLowerCase();
    }


}
