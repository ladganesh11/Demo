package com.scp.collection;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lkh = new LinkedHashSet<String>();
        lkh.add("Akash");
        lkh.add("Ganesh");
        lkh.add("Ramesh");
        lkh.add("yOgesh");
        System.out.println(lkh);
        @SuppressWarnings("unchecked")
		ListIterator<String> ltr = (ListIterator<String>) lkh.iterator();
        while(ltr.hasNext())
        {
        	String s = (String)ltr.next();
        	if(s.equals("Akash"))
        		ltr.remove();
        	if(s.equals("Ramesh"))
        		ltr.set("Rani");
        	if(s.equals("yOgesh"))
        		ltr.add("Yogita madam");
        }
        System.out.println(ltr);
        
		TreeSet<String> ts = new TreeSet<String> ();
		//ts.addAll("a".equals("z"));
		//ts.add(null);
		ts.add("A");
		ts.add("B");
		System.out.println("Before deleteing"+ts);

		try 
		{
		ts.addAll(null);
		ts.addAll(null);
		ts.addAll(null);
		}
		catch(NullPointerException npe)
		{
			System.out.println("dont insert null values in tresset");
		}
		finally 
		{
			System.out.println("release resourcess");
		}
		try
		{
			
		ts.remove(0);
		}
		catch (ClassCastException cce)
		{
			System.out.println("integer class not found");
		}
		System.out.println("after elements delete"+ts);
		
		System.out.println("A".compareTo("Z"));
		System.out.println("B".compareTo("A"));
		System.out.println("M".compareTo("M"));
        System.out.println();
	}

	
	
}
