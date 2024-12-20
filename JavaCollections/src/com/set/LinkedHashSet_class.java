package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSet_class {

	public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Element 1");
        linkedHashSet.add("Element 2");
        linkedHashSet.add("Element 3");

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking if an element is present
        boolean contains = linkedHashSet.contains("Element 2");
        System.out.println("Contains 'Element 2': " + contains);

        // Removing an element
        linkedHashSet.remove("Element 2");
        System.out.println("LinkedHashSet after removal: " + linkedHashSet);
    }
}
