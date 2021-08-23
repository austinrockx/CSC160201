// Austin Bennett
// CSC 160 Computer Science 1:
// August 4, 2021

package csc160Assignments;

import java.util.Scanner;

public class Program10 {
	
	//The GCD calculations done recursively.
	public int recursiveGCD(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return recursiveGCD(n, m % n);
		}
	}
	
	//The GCD calculations done iteratively.
	public int iterativeGCD(int m, int n) {
		 if (m == 0) {
			 return n;
		 } else if (n == 0) {
			 return m;
		 }
		while(m != n) {
			if (m > n) {
				m -= n;
			} else {
				n -= m;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Program10 p10 = new Program10(); //Created to allow me access to the other methods
		Scanner scr = new Scanner(System.in); //Scanner to allow User Input
		
		System.out.println("Please enter two numbers: ");
		
		//Two numbers from the users.
		int m = Integer.parseInt(scr.next());
		int n = Integer.parseInt(scr.next());
		
		System.out.println();
		System.out.println("The Greatest Common Divisor between " + m + " and " + n + " is " + p10.recursiveGCD(m, n)); //Prints the GDC recursively
		
		System.out.println();
		System.out.println("The Greatest Common Divisor between " + m + " and " + n + " is " + p10.iterativeGCD(m, n)); //Prints the GDC iteratively
		
	}

}
