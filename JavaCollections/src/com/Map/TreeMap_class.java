package com.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_class {

	 public static void main(String[] args) {
	        // Create a TreeMap
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Add elements
	        treeMap.put("Apple", 10);
	        treeMap.put("Banana", 20);
	        treeMap.put("Mango", 30);

	        // Display the TreeMap
	        System.out.println("Initial TreeMap: " + treeMap);

	        // Access an element
	        System.out.println("Value for key 'Apple': " + treeMap.get("Apple"));

	        // Remove an element
	        treeMap.remove("Banana");
	        System.out.println("TreeMap after removing 'Banana': " + treeMap);

	        // Check if a key exists
	        System.out.println("Does key 'Mango' exist? " + treeMap.containsKey("Mango"));

	        // Check if a value exists
	        System.out.println("Does value 20 exist? " + treeMap.containsValue(20));

	        // Iterate over the TreeMap
	        System.out.println("Iterating over the TreeMap:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Get the first and last keys
	        System.out.println("First key: " + treeMap.firstKey());
	        System.out.println("Last key: " + treeMap.lastKey());

	        // Get a subMap
	        System.out.println("SubMap from 'Apple' to 'Mango': " + treeMap.subMap("Apple", "Mango"));

	        // Clear the TreeMap
	        treeMap.clear();
	        System.out.println("TreeMap after clearing all elements: " + treeMap);
	    }
}
