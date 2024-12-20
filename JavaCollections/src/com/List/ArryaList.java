package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArryaList {
	
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> list = new ArrayList<>();
	        
	        
 // Basic OPerations
	        
	        // Add elements
	        list.add("Apple");
	        list.add("Banana");
	        list.add(1, "Cherry");
	        
	        System.out.println(list);
	        
	        // Get element
	        String fruit = list.get(1); // Cherry
	        System.out.println(fruit);
	        
	        // Check if list contains an element
	        boolean containsBanana = list.contains("Banana"); // true
	        System.out.println(containsBanana);
	        
	        // Remove element by index
	        list.remove(2); // Removes "Banana"
	        System.out.println(list);
	        
	        // Remove element by object
	        list.remove("Apple"); // Removes "Apple"
	        System.out.println(list);
	        
	        // Set element at specific index
	        list.set(0, "Date"); // Replaces "Cherry" with "Date"
	        
	        // Get size of the list
	        int size = list.size(); // 1
	        System.out.println(size);
	        
	        // Clear the list
	        list.clear();
	        
	        // Check if list is empty
	        boolean isEmpty = list.isEmpty(); // true
	        
	        System.out.println("     ");
	        
	        
// Bulk Operations
	        
	        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
	        
	        System.out.println(list2);
	        
	        // Add all elements from another collection
	        list2.addAll(Arrays.asList("Date", "Elderberry"));
	        System.out.println(list2);
	        
	        // Remove all elements that are in another collection
	        list2.removeAll(Arrays.asList("Banana", "Elderberry"));
	        System.out.println(list2);
	        
	        // Retain only the elements that are in another collection
	        list2.retainAll(Arrays.asList("Apple", "Cherry"));
	        System.out.println(list2);
	        
	        list2.removeLast();
	        System.out.println(list2);
	        
	        list2.addFirst("BAll"); // [BAll, Apple]
	        System.out.println(list2);
	        
	        list2.addLast("Cat");
	        System.out.println(list2);// [BAll, Apple, Cat]
	        
	        System.out.println("    ");
	        
// Search Operations	
	        
	        ArrayList<String> list3 = new ArrayList<>();
	        list3.add("Apple");
	        list3.add("Banana");
	        list3.add("Cherry");
	        list3.add("Banana");
	        
	        // Find the index of the first occurrence of an element
	        int firstIndex = list3.indexOf("Banana"); // 1
	        System.out.println(firstIndex);
	        
	        list.add("Cat");
	        
	        // Find the index of the last occurrence of an element
	        int lastIndex = list3.lastIndexOf("Banana"); // 3
	        System.out.println(lastIndex);
	        
	        list3.getFirst();
	        System.out.println(list3);
	        
	        System.out.println("     ");
	        
	     
// Iterator Operations	
	        
	        ArrayList<String> list4 = new ArrayList<>();
	        list4.add("Apple");
	        list4.add("Banana");
	        list4.add("Cherry");
	        
	        // Use an iterator to traverse the list
	        Iterator<String> iterator = list4.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        
	        System.out.println("   ");
	        
	        
// Array Operations	        
	        
	        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
	        
	        // Convert to array
	        String[] array = list5.toArray(new String[0]);
	        System.out.println(Arrays.toString(array)); // [Apple, Banana, Cherry]
	    }
	        
	        
	    }
 
	 

