package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaInterfacesTest {

	@Test
	public void test() {
		JavaInterfaces oji=new JavaInterfaces();
		//checking area of all square, rectangle and circle
		assertEquals(78.5, oji.area("circle",5.1f,0), 4);
		assertEquals(64, oji.area("square",7.9f,8f), 1);
		assertEquals(60, oji.area("rectangle",7.9f,8f), 5);
		//checking circumference for circle
		assertEquals(31.4 , oji.perimeter(5f),Math.abs(1));
		//checking area for square and rectangle
		assertEquals(30, oji.perimeter(7.9f,8f),2);
		assertEquals(35, oji.perimeter(7.9f,8f),4);
	}

}
