package com.scp.abstarct;

public class Vechile 
{
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub
        D d = new D ();
        d.m1();
        d.noOfWheel();
        d.drivng();
        d.m2();
        d.headLight();
	 //    B b = new B ();
	     //b.m1();
	     //b.notify();
	    // b.hashCode();
	    //b.noOfWheel();
	  //   b.toString();
	}

}
abstract class Four
{
	public void m1()
	{
		System.out.println("this is concrete method of abstarct class four");
	}
	public abstract int noOfWheel();
}
abstract class B extends Four
{
	public abstract void drivng();
	
	public final void  m2()
	{
	System.out.println("final method also be an implemented like that of concrete method ");	
	}
}
class D extends B
{
	public int noOfWheel()
	{
	System.out.println("no of wheels are 4");
	return 0;
	
	}
	public void drivng()
	{
		System.out.println("drivng method should be implemented from abstarct class B");
	}
	public static void headLight()
	{
		int x=10;
		for(x=10;x>=10;x--)
		{
		System.out.println("Static method also as concrete method ");
		
		if(x==5)
		{
			System.out.println("break applied on lighting a headlight");
        break;
		}
		else
		{
			System.out.println("dont apply break on front wheels");
		}
		}
	}
}

class E extends D
{
 //public abstract void clutch();
	/*Rule
	 *  1.if you have declared class as abstrct
	 *  2.then not compulasry class should have abstract method
	 *  3.if class is concrete and method is abstract then it compulsary to make class as ABSTRACT
	 *  4.IF abstract method in parrent class then its compulsary to implemented in child class
	 *  5.in abstract class have combination of concrete and non concrete method */
}