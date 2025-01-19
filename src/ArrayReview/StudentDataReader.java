package ArrayReview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentDataReader {

    public ArrayList<Student> readDataFromFile(String filename) {

        ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split("\\s");
                try {
                    Student newStudent = new Student(arr[0], Integer.parseInt(arr[1]));
                    studentList.add(newStudent);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Grade data!");
                    System.out.println("Skipping " + "'" + arr[0] +" " + arr[1]+"'");
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("IO error!");
        }

        return studentList;

    }

}
