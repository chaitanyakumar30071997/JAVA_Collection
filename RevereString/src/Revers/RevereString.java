package Revers;

public class RevereString {
    public static void main(String[] args) {
		String str = "Hello world ";
		String result = "";
	    int size = str.length();
		
	    for(int i = size -1; i>=0; i--)
			 result += str.charAt(i);
			 System.out.println(result);
		
	}
}
