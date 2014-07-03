/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class fibonacci 
{
	
	public static long fibo(int n)
	{
		if (n <= 1)
			return n;
		else
			return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args)
	{
		Boolean cont = true;
		
		while (cont == true)
		{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci numbers you want to see: ");
		int N = in.nextInt();
		
		for (int i = 0; i <= N; i++)
			System.out.println(fibo(i));
		
		System.out.println("Again? (1/0): ");
		int input = in.nextInt();
		
		if (input == 1)
			cont = true;
		else
			cont = false;
		
		}
	}

}
