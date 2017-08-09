package com.scp.superthis;

public class SuperThis{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
		
		A aa = new A ();
		aa.m1();
	    B a = new B();
		a.m1();
	    B bb = new B ();
		bb.m1();
		bb.m2();
	}

}
class A 
{
	int x =10;
	
	public A() 
	{
		// TODO Auto-generated constructor stub
	}
	public static  void m1()
	{
		int x =100;
		//System.out.println("printvalue of x"+this.x);
		System.out.println("value of y is "+x);
	}
	
}	
	class B extends A
	{
		int x =789899;
		
		public void m2()
		{
			System.out.println("value of instance varible is x ="+super.x);
		    System.out.println("value of x from Bclass"+this.x);
		    super.m1();
		}
	}
