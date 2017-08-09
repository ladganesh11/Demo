package com.scp.AllVaribles;

public class StaticVar {

	static int x =0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar var = new StaticVar();
		System.out.println(var.x++);
		Hall h = new Hall();
		System.out.println(x);
		System.out.println(x++);

		System.out.println(h.x);

		System.out.println(h.x++);
        //Has hh = new Has();
        
	}

}
class Hall 
{
	int x =10;
	public Hall()
	{
		// TODO Auto-generated constructor stub
	
	}
	public void singleCopy()
	{
		System.out.println(x);
	}
	
	class Has extends Hall 
	{
		public void m2()
		{
			System.out.println("value of x is:-----"+x);
		}
		
	}
}
