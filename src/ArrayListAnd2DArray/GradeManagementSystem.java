package ArrayListAnd2DArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int numberOfStudents;


        while (true) {
            try {
                System.out.print("Enter Number of Subjects: ");
                numberOfSubjects = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input must be an Integer");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter Number of Students: ");
                numberOfStudents = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input must be an Integer");
                scanner.next();
            }
        }

        Object[][] grades = new Object[numberOfStudents + 1][numberOfSubjects + 1];
        grades[0][0] = "";

        scanner.nextLine(); //deal with dangling \n char
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of Student #" + (i + 1) + ": ");
            grades[i + 1][0] = new Student(scanner.nextLine(), numberOfSubjects);
        }

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the name of Subject #" + (i + 1) + ": ");
            grades[0][i + 1] = new Subject(scanner.nextLine(), numberOfStudents);
        }

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                while (true) {
                    try {
                        System.out.print("Enter grade for " + ((Student) grades[i + 1][0]).getName() + " in " + ((Subject) grades[0][j + 1]).getSubjectName() + ": ");
                        int gradeVal = scanner.nextInt();
                        ((Student) grades[i + 1][0]).setSubjectGrade(j, gradeVal);
                        ((Subject) grades[0][j + 1]).setGrades(i, gradeVal);
                        grades[i+1][j+1] = gradeVal;
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Input must be an Integer");
                        scanner.next();
                    }
                }
            }
        }

        System.out.println("Grades Matrix: ");

        for (int i = 0; i <= numberOfStudents; i++) {
            for (int j = 0; j <= numberOfSubjects; j++) {
                System.out.print(grades[i][j]+ "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Average Grade for each student");
        for (int i = 1; i <= numberOfStudents; i++){
            float avg = ((Student) grades[i][0]).getStudentAverage();
            System.out.println(grades[i][0] + ": " + avg);
        }

        System.out.println("Average Grades for each subject");
        for (int i = 1; i <= numberOfSubjects; i++){
            float avg = ((Subject) grades[0][i]).calculateAverage();
            System.out.println(grades[0][i] + ": " + avg);
        }

        System.out.println("Highest and lowest grades for each subject");
        for (int i = 1; i <= numberOfSubjects; i++){
            Subject temp = (Subject) grades[0][i];
            System.out.println(grades[0][i] + " - Highest: " + temp.getHighestGrade() + ", Lowest: " + temp.getLowestGrade());
        }

    }

}
