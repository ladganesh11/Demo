package com.scp.Interface;

public abstract class Abst implements I1
{
	int x=9;
	public void m1()
	{
		System.out.println("this method from Interface I1");
	}

    public void m2()
{
	System.out.println("this method from Interface I1");
}
      public void m5()
{
	System.out.println("this is method of interface I1");
}
public int m4()
{
	return 0;
}
abstract void  m6();

}
class Tall extends Abst implements I3
{
	public void m6()
	{
		int x =299;
		
		
		System.out.println("value of x"+x);
		System.out.println( "value of x from abstarct class"+this.x);
		
		System.out.println("this is method from abstract class Abst");
	}
public static void main()
{
	//A a = new A ();
	
	
}
}