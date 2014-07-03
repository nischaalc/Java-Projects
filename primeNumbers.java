/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class primeNumbers
{

	public static void main(String[] args) 
	{
		
		int i = 1;
		Boolean cont = true;
		Scanner in = new Scanner(System.in);
		
		while (cont == true)
		{
			Boolean answer = isPrime(i);
			
			if (answer == true)
				System.out.println(i + " is a prime.");
			else
				System.out.println(i + " is not a prime");
			
			System.out.println("Continue? (1/0): ");
			int temp = in.nextInt();
			
			if (temp == 1) 
				cont = true;
			else 
				cont = false;
			
			i++;
			
		}		
		
	}

	static boolean isPrime(int n)
	{
		if (n==2) 
			return true;
		if ((n%2==0) || (n==1)) 
			return false;
    	
		for(int i=3;i*i<=n;i+=2) 
		{
			if(n%i==0)
            return false;
		}
		return true;
	}
}
