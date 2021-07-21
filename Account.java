// Austin Bennett
// CSC 160 Computer Science 1:
// July 14, 2021

//I didn't put the this reference on any of my variables because it seriously altered all my math for the interest.
//It would have return a negative decimal.

package csc160Assignments;

import java.util.Date;

public class Account {
	
	private int idInAccount;
	private double balanceInAccount;
	private double annualInterestRate;
	private Date dateCreated;
	
	//default account
	public Account() {
		idInAccount = 0;
		balanceInAccount = 0;
		dateCreated = new Date();
	}
	
	//created account
	public Account(int id, double balance) {
		idInAccount = id;
		balanceInAccount = balance;
	}

	public void setID(int id) {
		idInAccount = id;
	}
	
	public void setBalance(int balance) {
		if (balance >= 0) { // Checks if the balance is less then or equal to 0, so the balance isn't a negative.
			balanceInAccount = balance;
		} else {
			System.out.print("Your balance can't be less then 0.");
		}
	}
	
	public void setAnnualInterestRate(double AIR) {
		if (AIR >= 0) { //Same as setBalance.
			annualInterestRate = AIR;
		} else {
			System.out.print("Your annual interest rate can't be less then 0.");
		}
	}
	
	public void setDate(Date date) {
		dateCreated = date;
	}
	
	public int getID() {
		return idInAccount;
	}
	
	public double getBalance() {
		return balanceInAccount;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated = new Date();
	}
	
	//Divides the annual interest rate by 12 to get the monthly interest rate.
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	//Multiples the monthly interest rate by the balance to get the monthly interest.
	public double getMonthlyInterest() {
		return (getMonthlyInterestRate() * balanceInAccount) / 100;
	}
	
	//Subtract the withdraw value into the balance.
	public void withdraw(int wd) {
		balanceInAccount -= wd;
	}
	
	//Adds the deposit value into the balance.
	public void deposit(int dp) {
		balanceInAccount += dp;
	}
}
