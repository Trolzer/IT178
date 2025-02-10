package ArrayListAnd2DArray;

import java.util.ArrayList;
import java.util.Collections;

public class Subject {

    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private String subjectName;

    public Subject(String subjectName, int numberOfStudents) {
        this.subjectName = subjectName;
        for (int i = 0; i< numberOfStudents; i++){ //fill with numberOfStudents amount of -1
            grades.add(-1);
        }

    }

    public int getLowestGrade() {
        return Collections.min(grades);
    }

    public int getHighestGrade() {
        return Collections.max(grades);
    }

    public float calculateAverage() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += getGrade(i);
        }
        return (float) sum / grades.size();
    }

    public void setGrade(int index, int grade) {
        grades.set(index, grade);
    }

    public int getGrade(int index) {
        return grades.get(index);
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override//to make printing easier bc of needing to typecast in arrays with different types of object in them
    public String toString() {
        return getSubjectName();
    }
}
