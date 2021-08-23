package csc160Assignments;

import java.util.Scanner;

public class Chp12 {

	public static void main(String[] args) throws EvenNumberOnlyException {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = scr.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("Your Number is Vaild: " + num);
		} else {
			throw new EvenNumberOnlyException();
		}
	}

}
