package ArrayListAnd2DArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = -1;
        int numberOfStudents= -1;

        //get number of students and subjects. ask again if value is not an int or is negative
        boolean invalidNumber = true;
        while (invalidNumber) {
            try {
                System.out.print("Enter Number of Subjects: ");
                numberOfSubjects = scanner.nextInt();
                if (numberOfSubjects <= 0){ //make sure number is positive
                    System.out.println("Input must be a positive Integer!");
                }else {
                    invalidNumber = false;
                }

            } catch (InputMismatchException e) { //thrown if the input is not an integer
                System.out.println("Input must be a positive Integer");
                scanner.next();
            }
        }
        invalidNumber = true;
        while (invalidNumber) {
            try {
                System.out.print("Enter Number of Students: ");
                numberOfStudents = scanner.nextInt();
                if (numberOfStudents <= 0){ //make sure number is positive
                    System.out.println("Input must be a positive Integer");
                }else{
                    invalidNumber = false;
                }
            } catch (InputMismatchException e) { //thrown if the input is not an integer
                System.out.println("Input must be a positive Integer!");
                scanner.next();
            }
        }

        Object[][] grades = new Object[numberOfStudents + 1][numberOfSubjects + 1]; //set up 2d array, +1 on indexes is to make aligning the matrix easier
        grades[0][0] = ""; //not used

        scanner.nextLine(); //when you switch from nextInt to nextLine on the same scanner it leaves a dangling newline char that can cause problems, this deals with that
        for (int i = 0; i < numberOfStudents; i++) { //get the names of students and create the Student objects and put them in the array
            System.out.print("Enter the name of Student #" + (i + 1) + ": ");
            grades[i + 1][0] = new Student(scanner.nextLine(), numberOfSubjects);
        }

        for (int i = 0; i < numberOfSubjects; i++) { //same as above but with the Subject objects instead
            System.out.print("Enter the name of Subject #" + (i + 1) + ": ");
            grades[0][i + 1] = new Subject(scanner.nextLine(), numberOfStudents);
        }

        //for each student, enter a grade for each of their classes
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                while (true) {
                    try {
                        System.out.print("Enter grade for " + ((Student) grades[i + 1][0]).getName() + " in " + ((Subject) grades[0][j + 1]).getSubjectName() + ": "); //wierd casting stuff here is because the array has multiple types of objects
                        int gradeVal = scanner.nextInt();
                        ((Student) grades[i + 1][0]).setGrade(j, gradeVal);
                        ((Subject) grades[0][j + 1]).setGrade(i, gradeVal);
                        grades[i+1][j+1] = gradeVal;
                        break;
                    } catch (InputMismatchException e) { //make sure the input is an Integer
                        System.out.println("Input must be an Integer");
                        scanner.next();
                    }
                }
            }
        }

        //print the 2d array in a matrix
        System.out.println("Grades Matrix: ");
        for (int i = 0; i <= numberOfStudents; i++) {
            for (int j = 0; j <= numberOfSubjects; j++) {
                System.out.print(grades[i][j]+ "\t");
            }
            System.out.print("\n");
        }

        //averages for each student
        System.out.println("Average grades for each student");
        for (int i = 1; i <= numberOfStudents; i++){
            float avg = ((Student) grades[i][0]).calculateAverage();
            System.out.println(grades[i][0] + ": " + avg);
        }

        //averages for each subject
        System.out.println("Average grades for each subject");
        for (int i = 1; i <= numberOfSubjects; i++){
            float avg = ((Subject) grades[0][i]).calculateAverage();
            System.out.println(grades[0][i] + ": " + avg);
        }

        //high and lows for each subject
        System.out.println("Highest and lowest grades for each subject");
        for (int i = 1; i <= numberOfSubjects; i++){
            Subject temp = (Subject) grades[0][i];
            System.out.println(grades[0][i] + " - Highest: " + temp.getHighestGrade() + ", Lowest: " + temp.getLowestGrade());
        }

    }

}
