package RecursionProgram;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //scanner for input
        System.out.println("Input:");
        System.out.print("Enter a string to check if it's a palindrome:");
        String word = scan.nextLine();//get user input
        word = cleanString(word); //remove non letter chars + toLowercase
        System.out.println("Output:");
        if (isPalindrome(word, 0, word.length() - 1)) { //call recursive method to determine if string is a palindrome
            System.out.println("The input string is a palindrome."); //string is a palindrome
        } else {
            System.out.println("The input string is not a palindrome."); //string is not a palindrome
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {

        if (start >= end) { //base case
            return true;
        }
        if (word.substring(start, start + 1).equals(word.substring(end, end + 1))) { //check if start and end indexes match
            return isPalindrome(word, start + 1, end - 1); //recursive call to check the next letters
        }
        return false; //if the string differs forwards or backwards at any point
    }

    public static String cleanString(String str) {

        str = str.replaceAll("[^a-zA-Z]", ""); //replace all chars that are not A-Z upper or lowercase with nothing, removing them
        str = str.toLowerCase(); //convert all letters to lowercase
        return str;
    }

}
