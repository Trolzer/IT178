package ArrayListAnd2DArray;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> subjectGrades = new ArrayList<Integer>();

    public Student(String name, int numberOfSubjects){
        this.name = name;
        for (int i =0; i < numberOfSubjects; i++){
            subjectGrades.add(-1);
        }
    }

    public void setSubjectGrade(int index, int grade){
        subjectGrades.set(index,grade);
    }

    public int getSubjectGrade(int index){
        return subjectGrades.get(index);
    }

    public String getName(){
        return name;
    }

    public float getStudentAverage(){
        int sum = 0;
        for (int i = 0; i < subjectGrades.size(); i++){
            sum += subjectGrades.get(i);
        }
        return (float) sum / subjectGrades.size();
    }

    @Override
    public String toString() {
        return getName();
    }
}
