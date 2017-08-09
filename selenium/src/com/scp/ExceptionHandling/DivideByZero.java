/**
 * 
 */
package com.scp.ExceptionHandling;

/**
 * @author Ganesh
 *
 */
public class DivideByZero {

	public DivideByZero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.m1();
		B b =new  B();
		
		try {
			int x = 10;
			int i;
          try
          {
			int arr[]= new int[5];
            if(arr[6]==0)
            {
            	System.out.println(""+arr.toString());
            }
            else 
            {
            	System.out.println("print no");
            }
          }
          catch(ArrayIndexOutOfBoundsException aiobe)
  		{
  			System.out.println("please provide proper arrayindex");
  		}
          finally
          {
        	  System.out.println("inner try executed");
          }
  		
			float f = x;

			int zz = (int) f;

			for(f=0;f<=5;f++)
			{
				System.out.println(f);
			}
			System.out.println("print the value of X" + x);
			System.out.println("value of f" + f);
			System.out.println("value of zz" + zz);
			System.out.println(10 / 0);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("please enter a denomerator as greater than zero");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (NullPointerException npe) {
			System.out.println("this is null pointer exception");
		}

		catch (ClassCastException cce) {
			System.out.println("wrong class extended");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Number format exception");
		}
		finally {
			System.out.println("bydefault executed in file");
		}
	}

}

class A {
	public void m1() {
		System.out.println("this is m1 method of class A");
	}
}

class B extends A {
	public void m2() {
		System.out.println("class not found ");
	}
}