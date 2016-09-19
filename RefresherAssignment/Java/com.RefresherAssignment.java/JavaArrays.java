package com.RefresherAssignment.java;

public class JavaArrays 
{
	int []number;
	public JavaArrays(int []number)
	{
		this.number=number.clone();
	}
public int[] sortArray()
{
	for(int i=0; i<number.length;i++)
	{
		
		for(int j=i+1;j<number.length;j++)
		{
			if(number[j]<number[i])
			{
				int tmp=number[i];
				number[i]=number[j];
				number[j]=tmp;
			}
		}
	}
//	for(int i=0;i<number.length;i++)
//	{
	//System.out.print(number);
//	}
	return number;
}
	
}
