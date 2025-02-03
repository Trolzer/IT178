import java.util.Scanner;

public class CourseInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
	  Course myCourse = new Course();
      OfferedCourse myOfferedCourse = new OfferedCourse();

      String courseNumber, courseTitle;
      String oCourseNumber, oCourseTitle, instructorName, location, classTime;
	  System.out.print("Enter course number: ");
      courseNumber = scnr.nextLine();
	  System.out.print("Enter course title: ");
      courseTitle = scnr.nextLine();

	  System.out.print("Enter course number: ");
      oCourseNumber =  scnr.nextLine();
	  System.out.print("Enter course title: ");
      oCourseTitle =  scnr.nextLine();
	  System.out.print("Enter instructor name: ");
      instructorName = scnr.nextLine();
	  System.out.print("Enter location: ");
      location = scnr.nextLine();
	  System.out.print("Enter class time: ");
      classTime = scnr.nextLine();

		//Call the appropriate set methods
      myCourse.set
	  
	  
      System.out.prinln(myOfferedCourse);

      System.out.println("   Instructor Name: " + //fill in here);
      System.out.println("   Location: " + //fill in here);
      System.out.println("   Class Time: " + //fill in here);
   }
}
