package com.scp.Interface;
//import java.com.scp.Interface.Tall;
public class Test implements I1,I2
{
	int roll_no=1222;
	String ss ;
	
	Test( int roll_no,String ss)
	{
		roll_no =this.roll_no;
		ss=this.ss;
		System.out.println("roll_no of student:-"+roll_no+"\n Name of student is that"+ss);
	}
	public void  m1()
	{
		System.out.println("this is m1() method from Interfaec I1");
	}

	public void m2()
	{
		System.out.println("this is method from INTERFACE I1");
	}
	public  void m3()
	{
		System.out.println("this m2 method from interface i2");
	}
	public int m4()
	{
		System.out.println("this return type method from interface i1");
		return 0;
	}
	public static void main(String []args)
	{
		Test tt = new Test(12222,"Ganesh lad");

		for(int i=0;i<=2;i++)
		{
		tt.m1();
		tt.m2();
		tt.m3();
		tt.m4();
		Tall t = new Tall();
		t.m1();
		t.m2();
		t.m5();
		t.m6();
		

			/*Tall t1 = new Tall();
			t1.m1();
			t1.m2();
			t1.m4();
			t1.m5();
			t1.m6();*/
	/*if((tt.m1())!=(t.m1()))
	{
		System.out.println("accepted input through one of the m1()method");
	}
	else
	{
		System.out.println("not rejected merhod input");
	}*/
	}
}
	}
