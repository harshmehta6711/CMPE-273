package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class JavaGenericsTest {

	@Test
	public void test() {
		
		String[] studentName={"Rahul", "Sam", "James","Shim"};
		String[] studentName1={"Rahul","Sam","Calvin"};
		JavaGenerics jgen=new JavaGenerics(studentName);
		List<String> l1=new ArrayList<String>();
		List<String> l2=new ArrayList<String>();
		
		for(String s1:studentName)
			l1.add(s1);
		for(String s2:studentName1)
			l2.add(s2);
		List<String> marr=new ArrayList<String>();
		
		marr=jgen.mergeArray(l1,l2);
		
		assertEquals(Arrays.asList("Rahul", "Sam", "James","Shim","Calvin"), marr);
		
		
		
	}

}
