/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class ceasarCypher{
	
	public static void main(String[] args){
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l',
		'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner in = new Scanner(System.in);

		System.out.print("Enter text to be encoded: ");
		String text = in.nextLine();

		System.out.print("Enter an integer for cypher: ");
		int n= in.nextInt();	
		char[] c = text.toCharArray(); //entered text to an array of letters
		char[] out = encodeText(c,n,letters);
		System.out.print("Encoded text: ");
		printCode(out);
		System.out.println();
		System.out.println();

		@SuppressWarnings("unused")
		String ignore = in.nextLine(); //ignores the rest of the line
		System.out.print("Enter text to be decoded: ");
		String textD = in.nextLine();	
		
		boolean passed = false;
		int cyphKey = 0;
		
		while (!passed)
		{
			System.out.print("Enter cypher key: ");
			cyphKey = in.nextInt();
			
			if (cyphKey > 26)
				System.out.println("Try Again!");
			else 
				passed = true;

		}
		
		
		char[] dec = textD.toCharArray();
		decodeText(dec, letters, cyphKey);		
	}
	
	public static char[] encodeText(char[] c, int n,char[] A){
		char[] o = new char[c.length]; //create an array to output encrypted message
		for (int i=0; i<c.length;i++){
			//if array element is punc. mark or space, copy it
			if (c[i]==' ' || c[i]=='.' || c[i]==',') o[i] = c[i]; 
			//else, find in alphabet and shift for n
			else {
				alph: for (int j=0;j<A.length;j++){
					if (A[j]==c[i]){
					o[i] = A[(j+n)%A.length];
					break alph;
					}
				}
			}
		}
		return o;
	}
	
	public static void decodeText(char[] e,char[] A, int decKey){
			char[] decode = encodeText(e, 26 - decKey,A);
			printCode(decode);
			System.out.println();
	}
	
	public static void printCode(char[] out){
		for (int i=0; i<out.length;i++){
			System.out.print(out[i]);
		}
	}
}