package project;

import java.util.Scanner;

public class noOfCharsInString {

	public static void main(String args[])
	{
		//Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		//String str = in.nextLine();
		
		String str = "Hi! How are You?";
		
		int count = 0;
		
		for(int i=0;i<str.length(); i++) 
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		
		System.out.println("Number of characters: " + count);
		
		//in.close();
	}
}
