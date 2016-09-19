package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaArraysTest {

	@Test
	public void test() {
		int [] arr={1,5,3,5,2,8};
		JavaArrays jarray=new JavaArrays(arr);
		int [] sortedArr=jarray.sortArray();
		//int [] sortArr1={1,2,3,5,5,8};
		assertArrayEquals(new int[]{1,2,3,5,5,8},sortedArr);
			
	}
}
