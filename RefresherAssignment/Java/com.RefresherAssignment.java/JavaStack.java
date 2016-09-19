package com.RefresherAssignment.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class JavaStack
{	
	Stack st;	
	JavaStack()
	{		
		st = new Stack();
		
	}
	 public void pushItem(String name)
	 {
		st.push(name);
			
	 }
	 public String popItem()
	 {
		 if(!st.empty())
				{
				return st.pop().toString();
				}
				else
				{
					return "The Stack is already empty";
				}
		 
	 }
	 public String peekItem()
	 {
		 if(!st.empty())
		 {
			 return st.peek().toString();
		 }
		 return "The Stack is already empty";
	 }
}

//public class JavaStack {
//
//	public static void main(String[] args) {
//		
//		BufferedReader obf= new BufferedReader(new InputStreamReader(System.in));
//		Stack st = new Stack();
//		
//		System.out.println("Select the appropriate option ");
//		System.out.println("\n1--> Push the String \n2--> Pop the String \n Enter -1 to Exit");
//		int n=0;
//		do
//		{			
//			try {
//				n= Integer.parseInt(obf.readLine());
//			} catch (NumberFormatException e) {
//				
//				e.printStackTrace();
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			} 
//			if(n==1)
//			{
//				String name;
//				try {
//					name = obf.readLine();
//					st.push(name);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//											
//			}
//			if(n==2)
//			{
//				if(!st.empty())
//				{
//				System.out.println(st.pop());
//				}
//				else
//				{
//					System.out.println("The Stack is already empty");
//				}
//			}
//			
//			System.out.println("Select the appropriate option ");
//			System.out.println("\n1--> Push the String \n2--> Pop the String \n Enter -1 to Exit");
//		}while(n!=-1);
//
//	}
//
//}
