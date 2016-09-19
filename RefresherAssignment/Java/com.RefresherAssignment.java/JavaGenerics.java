package com.RefresherAssignment.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaGenerics {

	String [] studentName;
	List<String> list;
	
	JavaGenerics(String [] studentName)
	{
		studentName=new String[5];
		this.studentName=studentName;
		list=new ArrayList<String>();
		
	}
	void addItem(String [] studentName)
	{
		for(String student:studentName)
		{
			list.add(student);
			
		}
	}
	
	List<String> mergeArray(List<String> a,List<String> b)
	{
		Iterator<String> it= b.iterator();
		while(it.hasNext())
		{
			if(a.contains(it.next()))
			{
			it.remove();	
			}
		}
		a.addAll(b);
		return a;
	}

}
