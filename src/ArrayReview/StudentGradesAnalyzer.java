package ArrayReview;

import java.util.ArrayList;


public class StudentGradesAnalyzer {

    public static void main(String[] args) {

        StudentDataReader reader = new StudentDataReader();

        ArrayList<Student> studentList = reader.readDataFromFile("src/ArrayReview/Students.txt");

        int total = 0;
        float avgScore;
        int highestScore = -1;
        String highestScoreName = "";
        int lowestScore = -1;
        String lowestScoreName = "";
        int curScore;
        for (Student stu : studentList) {
            curScore = stu.getGrade();
            total += curScore;
            if (curScore > highestScore || highestScore == -1) {
                highestScore = curScore;
                highestScoreName = stu.getName();
            }
            if (curScore < lowestScore || lowestScore == -1) {
                lowestScore = curScore;
                lowestScoreName = stu.getName();
            }
        }

        avgScore = ((float)total / studentList.size());

        for (int i = 0; i < studentList.size()-1; i++){
            int minIndex = i;

            for (int j = i+1; j < studentList.size(); j++){
                if (studentList.get(j).getName().compareTo(studentList.get(minIndex).getName()) < 0){
                    minIndex = j;
                }
            }
            swap(studentList, minIndex, i);

        }

        System.out.print("Average Grade: ");
        System.out.printf("%.2f", avgScore);
        System.out.println("\nHighest Grade: " + highestScore + "(" + highestScoreName + ")");
        System.out.println("Lowest Grade: " + lowestScore + "(" + lowestScoreName + ")");

        System.out.println("\n" + "Sorted List of Students:");
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }

    public static void swap(ArrayList<Student> list, int index1, int index2){
        Student temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }


}
