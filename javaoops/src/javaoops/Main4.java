package javaoops;

public class Main4 {
	  public static void main(String[] args) {
	     
	        Account acc1 = new Account();
	        System.out.println("Account 1: ");
	        System.out.println("Account Number: " + acc1.accountNumber);
	        System.out.println("Initial Balance: " + acc1.checkBalance());
	        acc1.deposit(1500);
	        acc1.withdraw(400);
	        System.out.println("Final Balance: " + acc1.checkBalance());

	        Account acc2 = new Account("90879216", 10000);
	        System.out.println("\nAccount 2: ");
	        System.out.println("Account Number: " + acc2.accountNumber);
	        System.out.println("Initial Balance: " + acc2.checkBalance());
	        acc2.deposit(4000);
	        acc2.withdraw(5000);
	        System.out.println("Final Balance: " + acc2.checkBalance());
	    }
	}


