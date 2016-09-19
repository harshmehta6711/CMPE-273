package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import java.security.AlgorithmConstraints;

import org.junit.Test;

public class JavaCollectionsTest {

	@Test
	public void test() {
		JavaCollections jc=new JavaCollections();
		jc.addItems("Physics");
		assertEquals(1, jc.al.size());
		jc.al.remove(0);
		assertEquals(0, jc.al.size());
		jc.addItems("Physics");
		jc.addItems("Chemistry");
		jc.addItems("Maths");
		assertEquals(3, jc.al.size());
		
	}

}
