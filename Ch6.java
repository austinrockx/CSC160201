package csc160Assignments;

import java.util.Scanner;

public class Ch6 {
	
	public String countLetters(String x) {
		char[] ch = x.toCharArray();
		int letters = 0;
		
		for(int i = 0; i < x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letters ++;
			}
		}
		System.out.println("The number of letters is " + letters);
		
		return x;
	}

	public static void main(String[] args) {
		
		Ch6 ch6 = new Ch6();
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String word = scr.next();
		
		ch6.countLetters(word);
		
	}

}
