package src;
import java.util.Scanner;
public class ATMSimulator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Welcome page, Balance
		System.out.println("Welcome to the ATM!");
		double balance = 1000;
		System.out.println("Your balance is: $" + balance);
		
		int choice = 0;
		while (choice != 4) { // While loop repeats ATM menu
			showMenu();
			// Selected Choice
			System.out.print("Enter your choice:" );
			choice = input.nextInt();
			
			// Cases for ATM menu
			switch (choice) {
			//Balance
			case 1: 
				checkBalance(balance);
				break;
			case 2: 
				// Deposit
				System.out.println("Deposit Money Selected");
				System.out.print("Enter deposit amount: ");
				double deposit = input.nextDouble();
				balance = depositMoney(balance, deposit);
				break;
			case 3:
				//Withdraw
				System.out.println("Withdraw Money Selected");
				System.out.print("Enter withdraw amount: ");
				double withdraw = input.nextDouble();
				balance = withdrawMoney(balance, withdraw);
				break;
			case 4: 
				//Exit
				System.out.println("Thank you for using the ATM!");
				break;
			default: 
				System.out.println("Invalid Choice");
				break;
			}
		}
		
			input.close();
	}
	public static void showMenu() {
		//ATM menu
		System.out.println("\n===== ATM MENU =====");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit\n");
	}
	public static void checkBalance(double balance) {
		// Checks Balance
		System.out.println("Your current balance is: $" + balance);
	}
	public static double depositMoney(double balance, double deposit) {
		//Deposit
		if (deposit > 0 ) {
			balance += deposit;
			System.out.println("Deposit Successful!");
			System.out.println("Your new balance is: $" + balance);
			} else {
				System.out.println("Invalid deposit amount");
			}
		return balance;
	}
	public static double withdrawMoney(double balance, double withdraw) {
		// Withdraw
		if (withdraw <= 0) {
			System.out.println("Invalid withdrawal amount!");
		} else if (withdraw > balance) {
			System.out.println("Insufficient funds!");
		} else {
			balance -= withdraw;
			System.out.println("Withdraw successful!");
			System.out.println("Your new balance is: $" + balance);
		}
			return balance;
		
	}
	
}
