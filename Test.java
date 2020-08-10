package com.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
	
		Set<Integer> std=new TreeSet<Integer>();
	
	std.add(1);
	
			std.add(5);
	
		std.add(4);
		
				std.add(2);
	
	System.out.println("Normal via using TreeSet"+std.size());
	System.out.println("Highest Value: "+((TreeSet<Integer>) std).pollFirst());  
    System.out.println("Lowest Value: "+((TreeSet<Integer>) std).pollLast());
		Iterator<Integer> itr=std.iterator();  
	  
					while(itr.hasNext()){  
	   
						System.out.println(itr.next()); 
	  	}
	}
}
