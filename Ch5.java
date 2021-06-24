package csc160Assignments;

import java.util.Scanner;

public class Ch5 {

	public static void main(String[] args) {
		String reverse = "";
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String original = scr.nextLine();
		
		int length = original.length();
		
		for (int i = length - 1 ; i >= 0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("The reversed string is: " + reverse);
	}

}
