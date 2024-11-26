package com.SubString;

public class Sub {
	
	public static void main(String[] args) {
		
	
	String str = "The substring method in java is used to extract ";

	int start = 0;
	int End = 9;
	int size = str.length();
	
	
	System.out.println(str);
	System.out.println("String length is :- "+ size);
	
	String substr = (String) str.subSequence(start, End);
	System.out.println(substr.length());
	System.out.println(substr.indent(0));

	}
}
