/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class factorialFinder {

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial of: ");
		int num = in.nextInt();
		
		if (num >= 25)
			System.out.println("Oops that number is too big! Try a number between 1 and 24.");
		else
		{	
			System.out.println("Using loops: " + loop(num));
			System.out.println("Using recursion: " + recursive(num));
		}
		
	}

	static int recursive(int number)
	{
		if (number == 0)
			return 1;
		
		return number * recursive(number - 1);
	}
	
	static int loop(int number)
	{
		int answer = number;
		if (number == 0)
			return 1;
	
		for (int i = number - 1; i > 0; i--)
		{
			answer = answer * i;
		}
		
		return answer;
	}
}
