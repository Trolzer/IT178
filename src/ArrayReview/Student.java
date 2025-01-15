package ArrayReview;

public class Student {

    private final String name;
    private final int grade;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return name + " " + grade;
    }

    public int getGrade(){return grade;}
    public String getName(){return name;}

}
