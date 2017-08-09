package com.scp.collection;

import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v =new Vector<String>();
		System.out.println(v.capacity());
        v.add("Ram");
        v.add("Ramu");
        v.add("Ramesh");
        v.add("Gimmy");
        v.add("Sanjay");
        v.add("sarita");
        v.add("Rahul");
       System.out.println("Vector element added after creation"+v);
       
       Vector<Comparable> b =new Vector<Comparable>();
       System.out.println("size of vector class"+b.size());
       for(int i =0;i<=10;i++)
       {
    	  b.addElement(i);
    	  if(v.lastIndexOf(null)==b.indexOf(null, i))
    	  {
    		  System.out.println("print the element from both the vector"+v+"element from b"+b);
    	  }
    	  else
    	  {
    		  System.out.println("Exit from Vector");
    	  }
    	  System.out.println("added element from vector"+i);
       }
       v.add(5, "warren");
       v.add(6,"sukhdev");
       System.out.println("Vector element added after creation"+v);
       v.remove(5);
       v.firstElement();
       try
       {
       v.addAll(null);
       }
       catch(NullPointerException npe )
       {
    	   System.out.println("dont assign null value to the String");
    	   
       }
       finally
       {
    	   System.out.println("exit from TRy and Catch block");
       }
       System.out.println(" remove element after Vector element"+v);

	}

}
