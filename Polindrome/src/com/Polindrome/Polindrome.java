package com.Polindrome;

/*A string is side to be a Palindrome if it is the same if we start reading it from left to
right or right to left */

/* Lenght() ; method Start from 1.
 * index start from 0  
 * Srt.charAt(i)
 * The equals() method checks it two string are equal, return true both variable is same*/

public class Polindrome {
    public static void main(String[] args) {
        String str = "Hello world ";
        String rstr = "";
        int size = str.length();
        char ch;

        for (int i = 0; i < size; i++) {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }

        if (str.equals(rstr)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}

