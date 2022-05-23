package com.eval1;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	/**
	 * 
	 */
	Student() {
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student(int rollNumber, String studentName, int marks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public void ShowDetails() {
		System.out.println("Student roll number: "+rollNumber);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student marks: "+marks);
	}
	
}
