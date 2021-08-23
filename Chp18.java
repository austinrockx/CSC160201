package csc160Assignments;

import java.util.Scanner;

public class Chp18 {
	
	public void reverseString(String str) {
		StringBuilder input = new StringBuilder();
		
		if(str.isEmpty()) {
			return;
		}
		
		input.append(str);
		
		System.out.print(input.reverse());
}

	public static void main(String[] args) {
		Chp18 chp = new Chp18();
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a String to reverse: ");
		String reversal = scr.next();
		
		System.out.println();
		System.out.println("Reversed String: ");
		chp.reverseString(reversal);
		scr.close();
	}
}
