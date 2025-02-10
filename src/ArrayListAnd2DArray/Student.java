package ArrayListAnd2DArray;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> subjectGrades = new ArrayList<Integer>();

    public Student(String name, int numberOfSubjects){
        this.name = name;
        for (int i =0; i < numberOfSubjects; i++){ //fill with numberOfStudents amount of -1
            subjectGrades.add(-1);
        }
    }

    public void setSubjectGrade(int index, int grade){
        subjectGrades.set(index,grade);
    }

    public int getGrade(int index){
        return subjectGrades.get(index);
    }

    public String getName(){
        return name;
    }

    public float calculateAverage(){
        int sum = 0;
        for (int i = 0; i < subjectGrades.size(); i++){
            sum += getGrade(i);
        }
        return (float) sum / subjectGrades.size();
    }

    @Override //to make printing easier bc of needing to typecast in arrays with different types of object in them
    public String toString() {
        return getName();
    }
}
