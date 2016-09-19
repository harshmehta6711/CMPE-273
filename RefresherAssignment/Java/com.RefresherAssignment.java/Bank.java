package com.RefresherAssignment.java;

import java.io.*;
import java.util.*;

class Bank
{
public static void main(String st[])
{
Bank b1=new Bank();
Window deposit=new Window("Deposit",b1,true);
Window deposit1=new Window("Deposit1",b1,true);
Window withdrawal=new Window("Withdrawal",b1,false);

}
}

class Window implements Runnable 
{
Thread t;
Bank b1=new Bank();
boolean flag;
String name;
String account[]=new String[10];
String balance[]=new String[10];
double bal,with,total,d;
int m,n;
int i;

Window(String n,Bank b1,boolean flag)
{
this.b1=b1;
t=new Thread(this,n);
this.flag=flag;
for(int i=0;i<10;i++)
{
account[i]=Integer.toString(i+1);
balance[i]=Integer.toString(15000);
}
t.start();
}

public void run()
{
for(i=0;;i++)
//do
{
try
{
d=Math.random();
d=(int)((d*account.length)+1);
String s=t.getName();
System.out.println("Account no: "+(int)d+" for window: "+s);
Thread.sleep(1500);
if(s.equals("Deposit"))
{  
m=(int)d;
System.out.println("Deposit account: "+m);
}
else if(s.equals("Withdrawal"))
{
n=(int)d;
System.out.println("Withdrawal account: "+n);
}

if(m==n)
{
System.out.println("Deposit and withdrawal can not be done at a time in the same account");
System.exit(0);
}
	if(flag==false)
	{
	//System.out.println("Entered in if block");
	try
	{
	//System.out.println("Entered in wait block");
	wait();
	}
	catch(Exception e)
	{}
	//System.out.println("Exited from wait block");
	}
	//System.out.println("Exited from if block");
	if(s.equals("Deposit"))
	{
	//System.out.println("Entered in if block of diposit");
	System.out.println("Total balance in account "+(int)d+" before deposit "+balance[i]);
		total=(balance.length*(Math.random()+1)*1000);
		System.out.println(" Deposited Balance: "+total+ " for "+d);
		total=total+Double.parseDouble(this.balance[i]);
		this.balance[i]=Double.toString(total);
		System.out.println("Total balance for account : "+(int)d+ "is : "+total+"\n"); 
	}
	flag=true;
	try
	{
	notifyAll();												//notifyAll() method will throw an exception
	}
	catch(Exception e)
	{}
	
	if(flag==true)
	{
	try
	{
	wait();
	}
	catch(Exception e)
	{}
	}
	
	if(s.equals("Withdrawal"))
	{
	System.out.println("Total balance in account "+(int)d+" is "+balance[i]);
	bal=Double.parseDouble(this.balance[i]);
	this.with=(int)(balance.length*(Math.random()+1)*1000);
	System.out.println("Withdrawaled amount for account "+(int)d+" : "+this.with);
		if(this.bal-(int)this.with>500)
		{
		this.bal=this.bal-this.with;
		this.balance[i]=Double.toString(this.bal);
		System.out.println("Balance in account "+(int)d+" after withdrawaling "+this.balance[i]);
		}
		else
		{
		System.out.println("Not sufficient Balance for account "+(int)d);
		}
	}
	flag=false;
	try
	{
	notifyAll();												//notifyAll() method will throw an exception
	}
	catch(Exception e)
	{}
}
catch(Exception e)
{}
}//while(m==n);
}
}