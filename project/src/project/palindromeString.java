package project;

import java.util.Scanner;

public class palindromeString {
	
	static Scanner in;

	public static void main (String args[]) {
		
		String word, reverse = "";
		
		in = new Scanner(System.in);
		
		System.out.println("Enter a word to be verified for Palindrome: ");
		word = in.nextLine();
		
		for(int i = word.length()-1; i>=0; i--)
			reverse = reverse + word.charAt(i);
		
		if(word.equals(reverse))
			System.out.println(word + " : is a Palindrome");
		else
			System.out.println(word + " : is not a Palindrome");
	}
}
