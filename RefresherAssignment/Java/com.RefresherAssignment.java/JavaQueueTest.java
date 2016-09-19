package com.RefresherAssignment.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaQueueTest {

	@Test
	public void test() {
		JavaQueue jQueue= new JavaQueue();
		jQueue.addItem("Paul");
		jQueue.addItem("Ranjan");
		jQueue.addItem("James");
		jQueue.addItem("Lam");
		jQueue.addItem("India");
		assertEquals("Paul", jQueue.removeItem());
		assertEquals("Ranjan", jQueue.removeItem());
		assertEquals(3, jQueue.qu.size());
	}
}
