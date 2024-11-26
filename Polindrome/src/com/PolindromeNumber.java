package com;

public class PolindromeNumber {
	

	    public static void main(String[] args) {
	        int n = 121;
	        int reminder, reverse = 0;
	        int team = n;

	        while (n > 0) {
	            reminder = n % 10; 
	            reverse = reverse * 10 + reminder; 
	            n = n / 10; 
	        }
	        
	        if(team ==reverse) {
	        	System.out.println("Its  is a PolindromeNumber ");
	        }else {
	        	System.out.println("Its  is a Not  PolindromeNumber");
	        }

	       
	    }
	}




