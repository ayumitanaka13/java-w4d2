import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	// print method
	public static void printCourse(ArrayList<Course> courseList) {
		for (Course c : courseList) {
			System.out.println("Course Name : " + c.getCourseName() + 
					"\nDuration : " + c.getDuration() +
					"\nInstructor Name : " + c.getInstructor().getFirstName() +
					 " " + c.getInstructor().getLastName() + 
					 "\nInstructor Phone Number : " + c.getInstructor().getPhoneNumber() +
					 "\nInstructor Experienced Year : " + c.getInstructor().getExperiencedYear() +
					 "\nWe have " + c.getInstructor().getStatus() + "." + "\n");
		}
	}
	
	// find method
	public static String findInstructor(ArrayList<Course> courseList, String instructorName) {
		for (Course c : courseList) {
			if(c.getInstructor().getLastName().equalsIgnoreCase(instructorName)) {
				return instructorName + " is here.";
			}
		}
		return "The instructor does not exsits.";
	}

	// main method
	public static void main(String[] args) {
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		
		Instructor instructor1 = new Instructor("John", "Doe", "604-123-4567", 2);
		Course course1 = new Course("English", 8, instructor1);
		Instructor instructor2 = new Instructor("Kim", "Park", "604-123-4567", 1);
		Course course2 = new Course("Web", 10, instructor2);
		Instructor instructor3 = new Instructor("Sarah", "Smith", "604-123-4567", 6);
		Course course3 = new Course("App", 6, instructor3);
		Instructor instructor4 = new Instructor("Taro", "Yamada", "604-123-4567", 4);
		Course course4 = new Course("Marketing", 2, instructor4);
		
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		
		printCourse(courseList);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the last name of instructor:");
		String instructorName = input.nextLine();
		
		System.out.println(findInstructor(courseList, instructorName));
	}
	
}
