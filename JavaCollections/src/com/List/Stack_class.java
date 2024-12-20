package com.List;

import java.util.Stack;

public class Stack_class {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Popping the top element
        String topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        // Peeking at the top element
        topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Searching for an element
        int position = stack.search("Element 1");
        System.out.println("Position of 'Element 1': " + position);
    
	}
}
