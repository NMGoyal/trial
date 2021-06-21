package project;

public class swapStrings {

	public static void main(String args[]) {
		
		String str1 = "Swap";
		String str2 = "Strings";
		
		System.out.println("Original strings : " + str1 + " & " + str2);
		
		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		
		System.out.println("Swapped strings : " + str1 + " & " + str2);
	}
}

//substring(startindex, endindex) - startindex starts with 0, endindex starts with 1