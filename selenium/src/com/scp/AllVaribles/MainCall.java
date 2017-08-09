 package com.scp.AllVaribles;

public class MainCall

{
	int i ;
	

	public static void main(String[] args) 
	{
		
	// TODO Auto-generated method stub
        //while(i<=10)
        
		C.main(new String[0]);
		 //i++;
		int arr[] = new int[10];
		for(int i=0;i<=arr.length;i++)
			System.out.println("hhh"+i);
		}

}
 class A
{
  public static void m1()
  {
	  System.out.println("m1method of class A");
  }
}

class B 
{
	public void m2()
	{
		System.out.println("m2() method of B class");
	}
}
class C 
{
	public static void m3()
	{
		System.out.println("m3() from class C");
		
	}
public static void main(String[]args)
{
    System.out.println("this is main method of class C");
	for (int i=0;i<=10;i++)
	{
    A.m1();
	C.m3();
	System.out.println("###############################");
	}
	}
}