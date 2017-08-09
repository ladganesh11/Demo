package com.scp.superthis;

public class ConstInheri 
{
public static void main (String [] args)
{
	//A obj = new A ();
	AA obj1 = new BB();
	obj1.m1(11,12);
	}
}
class AA 
{
	public int m1(int x ,int y )
	{
		int sum = x+y;
		System.out.println("value of m1 of "+sum);
        return sum;
        }
	public AA()
	{
		System.out.println("this is constructor of class A");
	}
	
}
class BB extends AA
{
	public int m1()
	{
		System.out.println("oveeride metthod of 1");
		return 0;
		
	}
	
	public BB()
	{
		System.out.println("this is constructor from B  calass");
	}
}