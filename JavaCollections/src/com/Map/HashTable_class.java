package com.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable_class {
	 public static void main(String[] args) {
	        // Creating a Hashtable
	        Hashtable<Integer, String> hashtable = new Hashtable<>();

	        // Adding key-value pairs
	        hashtable.put(1, "One");
	        hashtable.put(2, "Two");
	        hashtable.put(3, "Three");

	        // Accessing elements
	        String value = hashtable.get(2); // Returns "Two"
	        System.out.println("Value at key 2: " + value);

	        // Checking if a key/value exists
	        boolean containsKey = hashtable.containsKey(3);
	        System.out.println("Contains key 3: " + containsKey);

	        boolean containsValue = hashtable.contains("One");
	        System.out.println("Contains value 'One': " + containsValue);

	        // Removing a key-value pair
	        String removedValue = hashtable.remove(2);
	        System.out.println("Removed value: " + removedValue);

	        // Iterating over keys
	        System.out.println("Iterating over keys:");
	        for (Integer key : hashtable.keySet()) {
	            System.out.println(key + ": " + hashtable.get(key));
	        }

	        // Iterating over values
	        System.out.println("Iterating over values:");
	        for (String val : hashtable.values()) {
	            System.out.println(val);
	        }

	        // Using Enumeration to iterate over elements
	        System.out.println("Using Enumeration to iterate:");
	        Enumeration<Integer> keys = hashtable.keys();
	        while (keys.hasMoreElements()) {
	            Integer key = keys.nextElement();
	            System.out.println(key + ": " + hashtable.get(key));
	        }

	        // Checking the size of the hashtable
	        int size = hashtable.size();
	        System.out.println("Size of hashtable: " + size);

	        // Clearing the hashtable
	        hashtable.clear();
	        System.out.println("Hashtable cleared. New size: " + hashtable.size());
	    }
}
