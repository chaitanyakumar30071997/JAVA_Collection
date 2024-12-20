package com.List;

import java.util.Vector;

public class vectorclass {

	public static void main(String[] args) {
		
	
	
    // Create a Vector
	Vector<String> vector = new Vector<>();

    // Add elements
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");
    
    System.out.println(vector);

    // Insert element at specific position
    vector.add(1, "Element4");

    // Get element
    String element = vector.get(2);
    System.out.println("Element at index 2: " + element);

    // Remove element by index
    vector.remove(1);

    // Remove element by object
    vector.remove("Element3");

    // Clear vector
    vector.clear();

    // Check if vector is empty
    boolean isEmpty = vector.isEmpty();
    System.out.println("Is vector empty? " + isEmpty);

    // Add elements again
    vector.add("Element1");
    vector.add("Element2");
    vector.add("Element3");

    // Get size of vector
    int size = vector.size();
    System.out.println("Size of vector: " + size);

    // Set element at specific position
    vector.set(0, "NewElement");

    // Check if vector contains an element
    boolean contains = vector.contains("Element1");
    System.out.println("Vector contains 'Element1': " + contains);

    // Get index of an element
    int index = vector.indexOf("Element1");
    System.out.println("Index of 'Element1': " + index);

    // Get last element
    String lastElement = vector.lastElement();
    System.out.println("Last element: " + lastElement);

    // Get first element
    String firstElement = vector.firstElement();
    System.out.println("First element: " + firstElement);

    // Clone vector
 //   Vector<String> clonedVector = (Vector<String>) vector.clone();
   // System.out.println("Cloned vector: " + clonedVector);

    // Convert vector to array
    Object[] array = vector.toArray();
    System.out.println("Vector as array: " + java.util.Arrays.toString(array));
    
  }
}
