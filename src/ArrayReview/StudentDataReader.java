package ArrayReview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentDataReader {

    public Student readDataFromFile(String filename){

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            Student [] studentList = new Student[4];
            while((line=reader.readLine())!=null){
                
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("IO error!");
        }

    }

}
