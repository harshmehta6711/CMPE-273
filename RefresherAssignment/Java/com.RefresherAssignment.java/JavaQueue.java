package com.RefresherAssignment.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	Queue qu;
	JavaQueue()
	{
		 qu = new LinkedList();
		
	}
	public void addItem(String studentName)
	{
		qu.add(studentName);
	}
	public String removeItem()
	{
		if(!qu.isEmpty())
		{
			return qu.remove().toString();
		}
		else
		{
			return "The Queue is already empty";	
		}
	}

}
