/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class primeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userNum = in.nextInt();
		
		List<Integer> primeNums = new ArrayList<Integer>();
		
		boolean hasPrimes = false;
		
		for (int i = 0; i < userNum; i++)
		{
			boolean primeN = isPrime(i);
			
			if (primeN == true)
				primeNums.add(i);
		}
		
		for (int i = 0; i < primeNums.size(); i++)
		{
			if (userNum%(primeNums.get(i)) == 0)
			{
				System.out.println(primeNums.get(i) + " is a prime factor of " + userNum);
				hasPrimes = true;
			}
		}
		
		if (hasPrimes == false)
			System.out.println("This number has no prime factors");
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
