package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaStackTest {

	@Test
	public void test() {
		JavaStack ojs=new JavaStack();
		ojs.pushItem("James");
		ojs.pushItem("Sam");
		ojs.pushItem("Redmond");
		ojs.pushItem("Le Meridian");
		ojs.pushItem("Duke");
		assertEquals("Duke",ojs.popItem());
		assertEquals("Le Meridian",ojs.peekItem());
		assertEquals("Le Meridian",ojs.popItem());
		
		
	}

}
