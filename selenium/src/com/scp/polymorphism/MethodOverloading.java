package com.scp.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mm= new MethodOverloading();
	    /*Sam ss = new Sam();
	    ss.m1();
	    ss.m1(122,15.2f);
	    Sam aa = new B();
	    aa.m1();
	    aa.m1(155,54454);
	    B  bb = new B ();
	    bb.m1();
	    bb.m1(456, 2566.255f);
	    bb.m2();
	    B bc = new C();
	    bc.m1();
	    bc.m1(4555, 25584.256f);
	    */
		Sam obj = new C();
		obj.m1();
		obj.m1(1255);
	    C cc = new C();
	   cc.m1();
	   cc.m2();
	}

}
class Sam 
{
	transient int varr =1222;
	int var=90;
	public  static void m1()
	{
		
		System.out.println("value of m1 from class Sam");
		
	}
	public static int m1(int no){
		System.out.println(no);
		return no;
		
	}
	/**
	 * @param var
	 */
	/*public Sam(int var) {
		super();
		this.var = var;
	}*/
	public void m1(int ss ,float wee)
	{
		System.out.println("value of m1");

	}
}

class B extends Sam
{

	int varr=244242;
	
	/**
	 * @param varr
	 */
	/*public B(int varr) {
		super();
		this.varr = varr;
	}*/
	public static void m1()
	{
		System.out.println("m1 from B class");
		
	}
	public void m2()
	{
		System.out.println("m2 from b class");
		int sum ;
		System.out.println(sum=super.varr+this.varr);
	}
}
class C extends B
{
	public static void m1()
	{
		System.out.println("m1 from class c");
		
	}
}