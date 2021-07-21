package csc160Assignments;

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account(1122, 20000);
		
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance());
		System.out.printf("Monthly interest: %.2f", acc.getMonthlyInterest());
		System.out.println();
		System.out.println("Date Created: " + acc.getDateCreated());
		
	}

}
