package project;

import java.util.Scanner;

public class reverseWordsInString {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String str;
		String rev ="";
		
		System.out.println("Enter the String : ");
		str = in.nextLine();
		
		String words[] = str.split(" ");
		
		System.out.println("String with reverse words is: ");
		
		for(int i=0; i<words.length; i++)
		{
			for(int j=words[i].length()-1; j>=0; j--) {
				rev = rev + words[i].charAt(j);
			}
			rev = rev + " ";
		}
			
		System.out.println(rev);
		
		in.close();
	}
}
