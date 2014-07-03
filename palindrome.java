/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		Boolean cont = true;
		
		while (cont)
				{
			
					Scanner in = new Scanner(System.in);
					System.out.println("Enter your word: ");
					String userString = in.nextLine();
					
					String newerString = removeSymbols(userString);
					newerString = newerString.toLowerCase();
					String pal = isPal(newerString);
					
					System.out.println(userString + " " + pal + " a palindrome" );
					
				}

	}
	
	static String isPal(String s)
	{
		
		String result = null;
		
		for (int i = s.length() - 1, j = 0; i >= 0; i--, j++)
		{
			
			if (s.charAt(i) == s.charAt(j))
				result = "is";
			else
			{
				i = 0;
				result = "is not";
			}
			
		}
		
		return result;
	}
	
	static String removeSpace(String s)
	{
		
		String newString = null;
		
		for (int i = 0; i < s.length(); i++)
		{
			newString = s.replace(" ", "");
		}
		
		return newString;
	}

	static String removeSymbols(String s)
	{
		String newString = null;
		
		newString = s.replaceAll("[^a-zA-Z]", "");
		
		return newString;
	}
}
