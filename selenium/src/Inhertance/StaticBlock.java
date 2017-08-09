package Inhertance;

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main method of class static block ");//1 main method executed in overloaded class in jvm
		A a = new A();
		a.m1();
		B b = new B(12);
		b.m1();
		System.out.println("value of var from B class"+b.var);
		A aa = new B();
		
	}

}
class A 
{
    int instanceVar;
    
	static 
	{
	final int loc=122;
		
		System.out.println("static block of class a");
		
	}
	public static void m1()
	{
		System.out.println("this is static method m1 of class A ");
	}
}
class B extends A
{    
	int var ;
	
	/**
	 * 
	 */
	public static void m1()
	{
		System.out.println("this is static method m1 of class B ");
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param var
	 */
	public B(int var) {
		super();
		this.var = var;
		System.out.println("vlaue of var"+var);
	}

	{
		System.out.println("INSTANCE BLOCK OF CLASS B");
		
	}
	
	static 
	{
		System.out.println("staicblock of class B");
	}
}