package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHaseMap_class {

	 public static void main(String[] args) {
	        // Create a LinkedHashMap
	        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

	        // Add elements
	        linkedHashMap.put("Apple", 10);
	        linkedHashMap.put("Banana", 20);
	        linkedHashMap.put("Mango", 30);

	        // Display the LinkedHashMap
	        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

	        // Access an element
	        System.out.println("Value for key 'Apple': " + linkedHashMap.get("Apple"));

	        // Remove an element
	        linkedHashMap.remove("Banana");
	        System.out.println("LinkedHashMap after removing 'Banana': " + linkedHashMap);

	        // Check if a key exists
	        System.out.println("Does key 'Mango' exist? " + linkedHashMap.containsKey("Mango"));

	        // Check if a value exists
	        System.out.println("Does value 20 exist? " + linkedHashMap.containsValue(20));

	        // Iterate over the LinkedHashMap
	        System.out.println("Iterating over the LinkedHashMap:");
	        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Access order example
	        linkedHashMap.get("Apple");  // Accessing 'Apple'
	        linkedHashMap.get("Mango");  // Accessing 'Mango'
	        System.out.println("LinkedHashMap after access order changes: " + linkedHashMap);

	        // Clear the LinkedHashMap
	        linkedHashMap.clear();
	        System.out.println("LinkedHashMap after clearing all elements: " + linkedHashMap);
	    }
}
