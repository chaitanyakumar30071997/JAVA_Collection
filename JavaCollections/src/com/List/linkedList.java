package com.List;

import java.util.LinkedList;

public class linkedList {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// Adding elements
		list.add("Apple");
		list.add("Banana");
		list.addFirst("Orange");
		list.addLast("Grapes");
		list.add(1, "Apple");

		// Accessing elements
		System.out.println(list.getFirst()); // Outputs "Orange"
		System.out.println(list.getLast());  // Outputs "Grapes"
		System.out.println(list.get(1));     // Outputs "Apple"

		// Removing elements
		list.removeFirst(); // Removes "Orange"
		list.removeLast();  // Removes "Grapes"
		list.remove("Apple");

		// Checking presence
		System.out.println(list.contains("Banana")); // Outputs "true"

		// Size of the list
		System.out.println(list.size()); // Outputs "1"
		
	
	}
	
}
