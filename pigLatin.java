/*
Author: Nischaal Cooray
Description: A Java program built as a solution to a project suggestion on Karan Goels Projects repo.
Date: 4/7/14
*/

import java.util.*;

public class pigLatin
{
	
    public static void main(String[] args) {
		
		String pig = "";
		char[] vowels = {'A', 'E', 'I', 'O', 'U'}; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a word to be translated to Pig Latin:");
        String str = scan.nextLine();
        scan.close();
        
        for(int i = 0; i < vowels.length; i++){
        	if(str.toUpperCase().charAt(0) == vowels[i]){
        		pig = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() + "ay";
        		break;
        	}
        }
        
        if(pig.isEmpty()){pig = str.substring(1,2).toUpperCase() + str.substring(2).toLowerCase() + str.toLowerCase().charAt(0) + "ay";}
        
        System.out.println("Original Word: " + str);
        System.out.println("Pig Latin Word: " + pig);

    }

}


