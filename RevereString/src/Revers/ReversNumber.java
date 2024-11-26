package Revers;



public class ReversNumber {
    public static void main(String[] args) {
        int n = 123;
        int reminder, reverse = 0;

        while (n > 0) {
            reminder = n % 10; 
            reverse = reverse * 10 + reminder; 
            n = n / 10; 
        }

        System.out.println(reverse);
    }
}

