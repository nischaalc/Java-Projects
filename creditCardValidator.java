/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class creditCardValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a credit card number without spaces: ");
		String cardNumber = in.next();
		
		char[] cardChar = cardNumber.toCharArray();
		int[] number = new int[cardChar.length];
		
		for (int i = 0; i < number.length; i++)
		{
			number[i] = Character.digit(cardChar[i], 10); 
		}
		
		int checkSum = 0;
		
		for (int j = 0; j < 16; j+=2)
		{
			number[j] = number[j]*2;
			
			if (number[j] > 10)
			{
				checkSum += 1 + number[j]%10;
			}
			else
			{
				checkSum += number[j];
			}
			checkSum += number[j+1];
		}
		
		if (checkSum%10 == 0)
			System.out.println("Card is valid");
		else {
			System.out.println("Card is not valid");
		}
		
	}

}
