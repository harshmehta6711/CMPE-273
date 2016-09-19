package com.RefresherAssignment.java;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class JavaCollections {
	ArrayList al;
	public JavaCollections() {
		al=new ArrayList();
	}
	public void addItems(String item)
	{
		al.add(item);
		
	}
	public void addMiddleItems(int n,String item)
	{
		al.add(n, item);		
	}
	
	public void traverseItem()
	{
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
