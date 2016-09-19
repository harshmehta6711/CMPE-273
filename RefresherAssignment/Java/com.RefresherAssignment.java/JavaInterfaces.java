package com.RefresherAssignment.java;

public class JavaInterfaces implements IJavaInterfaces{

	double area;
	double perimeter;
	public double perimeter(float length, float breadth) {
		// TODO Auto-generated method stub
		perimeter = 2*(length+breadth);
		return perimeter;
	}

	public double perimeter(float radius) {
		// TODO Auto-generated method stub
		perimeter= 2*pie*radius;
		return perimeter;
	}

	public double area(String shape, float length, float breadth) {
		// TODO Auto-generated method stub
		switch(shape)
		{
		case "square": area=length*breadth;
						return area;
						
		case "rectangle": area=length*breadth;
		return area;
		
		case "circle":area=pie*length*length;
		return area;
					
		}
		return 0;
	}

	

	

}
