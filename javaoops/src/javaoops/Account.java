package javaoops;

public class Account {
	
	     String accountNumber;
	     double balance;

	    public Account() {
	        this.accountNumber = "12345678";
	        this.balance = 100.0;
	    }

	    public Account(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit Successful. Amount Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal Successful. Amount Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal amount.");
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }


}
