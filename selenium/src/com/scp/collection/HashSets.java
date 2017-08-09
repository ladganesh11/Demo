package com.scp.collection;

import java.util.HashSet;
import java.util.ListIterator;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> hs =new HashSet<Character>();
		hs.add('a');
		hs.add('b');
		hs.add('c');
		hs.add('d');
		hs.add('e');
		hs.add('e');
		hs.add(null);
		hs.add('a');
		hs.add(null);
      System.out.println(hs);
      try
      {
      ListIterator ld = (ListIterator) hs.iterator();
      
      
      while (ld.hasNext())
      {
    	  Character ch =(Character)ld.next();
    	  if(ch.equals(ch))
    	  {
    		  ld.remove();
    		  System.out.println(ch);
    	  }  }
      }
      catch(ClassCastException cce)
      {
    	  System.out.println("class caste exception");
      }
      
	}

}
