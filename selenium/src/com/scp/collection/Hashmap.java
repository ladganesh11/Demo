package com.scp.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		HashMap hs =new HashMap();
		//hs.add(100,"Ganesh");
		hs.put(100, "Ganesh");
		hs.put(101, "sashi");
		hs.put(455, "dhjjd");
		System.out.println(hs);
	Set set =hs.entrySet();
	Iterator ltr =set.iterator();
	while(ltr.hasNext())
	{
		Map.Entry m = (Map.Entry)ltr.next();
		System.out.println(m.getValue()+""+m.getKey());
	}
	
	}

}
