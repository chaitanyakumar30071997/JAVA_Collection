package com.set;

import java.util.TreeSet;

public class TreeSet_class {
	  
	 public static void main(String[] args) {
		
	

	 TreeSet<String> treeSet = new TreeSet<>();

     // Adding elements
     treeSet.add("Element 1");
     treeSet.add("Element 2");
     treeSet.add("Element 3");

     // Displaying the TreeSet
     System.out.println("TreeSet: " + treeSet);

     // Checking if an element is present
     boolean contains = treeSet.contains("Element 2");
     System.out.println("Contains 'Element 2': " + contains);

     // Removing an element
     treeSet.remove("Element 2");
     System.out.println("TreeSet after removal: " + treeSet);
 }
	
}
