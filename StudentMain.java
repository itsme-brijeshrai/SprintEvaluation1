package com.eval1;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students you want to enter");
		int number = sc.nextInt();
		System.out.println("=========================================");
		for(int i=0;i<number;i++) {
			System.out.println("Enter the roll number :");
			int roll = sc.nextInt();
			
			System.out.println("Enter the name :");
			String name = sc.next();
			
			System.out.println("Enter the marks :");
			int marks = sc.nextInt();
			
			Student st = new Student(roll,name,marks);
			st.ShowDetails();
		}
		sc.close();

	}

}
