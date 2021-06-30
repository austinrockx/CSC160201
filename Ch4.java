package csc160Assignments;

import java.util.Scanner;

public class Ch4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter another string: ");
		String s2 = input.nextLine();
		
		// if the s1 string as an occurrence of string s2.
		  if (s1.indexOf(s2) != -1) {
	            System.out.printf("%s is a substring of %s%n", s2, s1); // reports that its a substring
	        }
		  // if s2 as an occurrence of s1.
	        else if(s2.indexOf(s1) != -1){
	        	System.out.printf("%s is a substring of %s%n", s1, s2); 
	        }
	        else {
	        	System.out.printf("%s is not a substring of %s%n", s2, s1); // else reports that it's not
	        }
	}
}
