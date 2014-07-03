/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class decConverter {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userInt = in.nextInt();
		
		int num = userInt;
		String binary = "";
		
		while (num != 0)
		{
			int remainder = num%2;
			num = num/2;
			
			binary = binary + remainder;
		}
		
		String result;
		result = flip(binary);
		result = fillRem(result);
		System.out.println(result);
		
		System.out.println("Converting back!");
		
		int power = 0;
		int number = 0;
		int binaryNum = Integer.valueOf(result);
		
		while (binaryNum != 0)
		{
			number = (int) (number + ((binaryNum%10)*(Math.pow(2, power))));
			power++;
			binaryNum = binaryNum/10;
		}
		
		System.out.println(number);

	}

	static String flip(String s)
	{
		String newString = "";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			newString = newString + s.charAt(i);
		}
		
		return newString;
	}
	
	static String fillRem(String s)
	{
		String temp = s;
		String zeroes = "";
		
		if (s.length() < 8)
		{
			for (int i = s.length() - 1; i < 9; i++)
			{
				zeroes = zeroes + 0;
			}
		}
		
		temp = zeroes + temp;
		return temp;
	}
}
