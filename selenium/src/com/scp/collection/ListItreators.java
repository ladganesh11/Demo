package com.scp.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItreators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> bk = new LinkedList<String>();
		bk.add("javadevelopement");
		bk.add("dbms");
		bk.add("javadevelopement");
		bk.add("db");
		System.out.println(bk);
		ListIterator<String> li = bk.listIterator();
		while(li.hasNext())
		{
			String s = (String)li.next();
			if(s.equals("javadvelopment"))
			{
				li.remove();
				System.out.println(s);
				System.out.println();
			
			}
			System.out.println(s);
			//System.out.println();
		}
		
		

	}

}
