package com.eval1;
import java.util.Scanner;
public class Course {
	int courseId;
	String courseName;
	int coursefee;
	
	public void displayCourseDetails(int courseId,String courseName, String coursefee) {
		System.out.println("Course id is"+courseId + " courseName is "+courseName+ " coursefee is "+coursefee);
	}
	
	static void authenticate(String username, String password) {
		if(username == "Admin" && password == "1234") {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Course Id: ");
			int courseId = sc.nextInt();
			System.out.println("Enter courseName: ");
			String courseName = sc.next();
			System.out.println("Enter Coursefee: ");
			String coursefee = sc.next();
			sc.close();
			
			Course cu = new Course();
			cu.displayCourseDetails(courseId, courseName, coursefee);
		}else {
			System.out.println("Invalid Username or Password");
		}
	}
	public static void main(String[] args) {
		authenticate("Admin","1234");
		authenticate("Brijesh","123");
		

	}

}
