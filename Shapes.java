package com.eval1;

public class Shapes {
	public void area (long circle) {
		long area = (4/3)*(22/7)*(circle*circle);
		System.out.println("Area of circle is : "+ area);
	}
	
	public void area (int lenght, int breadth) {
		int area = 2*(lenght+breadth);
		System.out.println("Area of a rectangle is : "+area);
	}
	
	public void area (int side) {
		int area = side*side;
		System.out.println("Area of square is : "+area);
	}
}
