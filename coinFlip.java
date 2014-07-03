/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class coinFlip {

	public static void main(String[] args) {
		Random coin = new Random();
		Random compCallRandom = new Random();
		String result = "";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of flips to simulate:");
		int numFlips = in.nextInt();
		int headC = 0, tailC = 0, predict = 0;
		
		for (int i = 0; i < numFlips; i++)
		{
			
			String pred = "";
			
			int compPred = compCallRandom.nextInt();
			
			if (compPred%2 == 0)
				pred = "Heads";
			else
				pred = "Tails";	
			
			if ((coin.nextInt())%2 == 0)
			{
				result = "Heads";
				headC++;
			}
			else 
			{
				result = "Tails";
				tailC++;
			}
			
			if (pred.equalsIgnoreCase(result))
				predict++;
		}
		
		System.out.println("Final Tally: ");
		System.out.println("Heads: " + headC);
		System.out.println("Tails: " + tailC);
		System.out.println("Computer called correctly " + predict + " times!");

		
	}
}
