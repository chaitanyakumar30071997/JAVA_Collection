package com.Sort;

public class SortString {
    public static void main(String[] args) {
        String str = "tell";
        char temp;
        char[] charr = str.toCharArray();

        for (int i = 0; i < charr.length; i++) {
            for (int j = i + 1; j < charr.length; j++) {
                if (charr[i] > charr[j]) {
                    temp = charr[i];
                    charr[i] = charr[j];
                    charr[j] = temp;
                }
            }
        }

        String sorted = new String(charr); // Convert char array back to a string
        System.out.println(sorted);
    }
}
