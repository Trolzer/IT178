package InheritanceLab;

public class OfferedCourse extends Course{

    private String instructorName;
    private String classLocation;
    private String classTime;

    public String getClassLocation() {
        return classLocation;
    }

    public String getInstructorName(){
        return  instructorName;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public void setClassTime(String classTime){
        this.classTime = classTime;
    }



    @Override
    public String toString() {
        return "Course Information: \n" +
                "\tCourse Number: " + getCourseNumber() + "\n" +
                "\tCourse Title: " + getCourseTitle() + "\n" +
                "\tInstructor: " + getInstructorName() + "\n" +
                "\tLocation: " + getClassLocation() + "\n" +
                "\tClass Time: " + getClassTime();
    }
}
