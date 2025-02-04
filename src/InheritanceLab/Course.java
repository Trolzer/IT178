package InheritanceLab;

public class Course {
    private String courseNumber;
    private String courseTitle;

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "Course Information: \n" +
                "\tCourse Number: " + getCourseNumber() + "\n" +
                "\tCourse Title: " + getCourseTitle();
    }
}
