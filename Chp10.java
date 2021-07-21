package csc160Assignments;

import java.util.Scanner;

public class Chp10 {

	public static void main(String[] args) {
		Account [] accounts = new Account[10];
		Scanner scr = new Scanner(System.in);
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		System.out.println("Please enter an id (0 to 9): ");
		int id = scr.nextInt();
		
		System.out.println("Would you like to withdraw money, deposit money, or both today: ");
		String request = scr.next();
		
		if (request.equalsIgnoreCase("withdraw")) {
			System.out.println("Please enter withdraw amount: ");
			int withdraw = scr.nextInt();
			accounts[id].withdraw(withdraw);
			
		} else if (request.equalsIgnoreCase("deposit")) {
			System.out.println("Please enter deposit money amount: ");
			int deposit = scr.nextInt();
			accounts[id].deposit(deposit);
			
		} else if (request.equalsIgnoreCase("both")) {
			System.out.println("Please enter amounts (withdraw frist then deposit): ");
			int w = scr.nextInt();
			int d = scr.nextInt();
			accounts[id].withdraw(w);
			accounts[id].deposit(d);
			
		}
		
		System.out.println("New Balance of account: " + accounts[id].getBalance());
		
	}

}
