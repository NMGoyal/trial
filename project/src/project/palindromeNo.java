package project;

import java.util.Scanner;

public class palindromeNo {

	public static void main (String args[]) {
		
		int num;
		int rev = 0;
		int rem , temp;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the number to be checked as Palindrome: ");
		num = in.nextInt();
		
		temp = num;
		
		while(num > 0)
		{
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		
		if(temp==rev)
			System.out.println(temp + " : is a palindrome number.");
		else
			System.out.println(temp + " : is not a palindrome number.");
		
		in.close();			// Close scanner
	}
}
