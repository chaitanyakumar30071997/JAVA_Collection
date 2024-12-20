package com.set;

import java.util.HashSet;

public class haseset_class {

	public static void main(String[] args) {
		
	
	
	 HashSet<String> hashSet = new HashSet<>();

     // Adding elements
     hashSet.add("Element 1");
     hashSet.add("Element 2");
     hashSet.add("Element 3");

     // Displaying the HashSet
     System.out.println("HashSet: " + hashSet);

     // Checking if an element is present
     boolean contains = hashSet.contains("Element 2");
     System.out.println("Contains 'Element 2': " + contains);

     // Removing an element
     hashSet.remove("Element 2");
     System.out.println("HashSet after removal: " + hashSet);
  }
}
