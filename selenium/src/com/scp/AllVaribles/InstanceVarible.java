package com.scp.AllVaribles;

public class InstanceVarible {

    int x =900;
    
    public static void m1()
    {
    	int x =1000;
    	System.out.println("value of local varible x is in side the method  m1()"+x);
    	for (int i=1;i<=10;i++)
    	{
    		//System.out.println("value of i inside the method m1()"+i);

    		int table =i*2;
    		if(i%2==0)
    		{
    			System.out.println("print value of i"+i);
    		}
    		else
    		{
    			System.out.println("print rest of values of i "+i);
    		}
    		
    		System.out.println("value of i inside the method m1()"+table);

    			}
    }

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
        
		//System.out.println(x);Instance vsrible doesnot access in static area(E.g pvsm(),and static method
		InstanceVarible it = new InstanceVarible();
	    System.out.println("value of instance varible"+it.x);
	    it.m1();
	    }
}
