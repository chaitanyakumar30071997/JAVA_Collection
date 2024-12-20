package com.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HaseMap_class {
	
	public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);

        // Display the HashMap
        System.out.println("Initial HashMap: " + map);

        // Access an element
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Remove an element
        map.remove("Banana");
        System.out.println("HashMap after removing 'Banana': " + map);

        // Check if a key exists
        System.out.println("Does key 'Mango' exist? " + map.containsKey("Mango"));

        // Check if a value exists
        System.out.println("Does value 20 exist? " + map.containsValue(20));

        // Iterate over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Replace a value
        map.replace("Apple", 50);
        System.out.println("HashMap after replacing value for 'Apple': " + map);

        // Clear the HashMap
        map.clear();
        System.out.println("HashMap after clearing all elements: " + map);
    }

}
