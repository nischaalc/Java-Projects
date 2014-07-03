/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class sorting {


	public static void main(String[] args)
	{
		int[] intChars;
		int k = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers are you entering? ");
		int arrSize = in.nextInt();
		intChars = new int[arrSize];
		System.out.println("Enter a series of " + arrSize + " numbers: ");
		
		while (k < arrSize)
		{
			intChars[k] = in.nextInt();
			k++;
		}		
		
		System.out.print("Bubble Sort: ");
		printArr(bubbleSort(intChars));

	}

	static void printArr(int[] intChar)
	{
		for (int i = 0; i < intChar.length; i++)
		{
			System.out.print(intChar[i] + " " );
		}
	}
	
	static int[] bubbleSort(int[] uArr)
	{
		for (int i = uArr.length - 1; i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (uArr[j] > uArr[j+1])
				{
					int temp = uArr[j];
					uArr[j] = uArr[j+1];
					uArr[j+1] = temp;
				}
				
			}
		}
		
		return uArr;
	}

}
