/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class collatzConjecture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int userNum = in.nextInt();
		int orig = userNum;
		int steps = 0;
		
		while (userNum != 1)
		{
			if (userNum%2 == 0)
				userNum = userNum / 2;
			else
				userNum = (userNum * 3) + 1;
			
			steps++;
		}
		
		System.out.println("It took " + steps + " steps to reduce " + orig + " to 1");

	}

}
