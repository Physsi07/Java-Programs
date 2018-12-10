import java.util.Scanner;

public class BankAccount {

	int balance;
	int previousTransaction;
	String clientName;
	String clientID;

	// constructor
	public BankAccount(String clientName, String clientID){
		this.clientName = clientName;
		this.clientID = clientID;
	}

	public void deposit(int amount){
		if(amount != 0){
			balance += amount;
			previousTransaction = amount;
		}
	}

	public void withdraw(int amount){
		if(amount != 0){
			balance -=amount;
			previousTransaction = -amount;
		}
	}

	public void getPreviousTransaction(){
		if(previousTransaction > 0){
			System.out.println("Withdraw: " + Math.abs(previousTransaction));
		} else if (previousTransaction < 0){
			System.out.println("Withdraw: " + Math.abs(previousTransaction));
		} else {
			System.out.printf("No Transaction occured");
		}
	}

	public void showMenu(){
		Scanner scanner = new Scanner(System.in);
		char option = '\0';
		System.out.printf("Welcome " + clientName);
		System.out.printf("Your ID is " + clientID + "\n");
		System.out.printf("A. Check Balance");
		System.out.printf("B. Deposit");
		System.out.printf("C. Withdraw");
		System.out.printf("D. Previous Transaction");
		System.out.printf("E. Exit");

		do{

			System.out.printf("*********************");
			System.out.printf("Enter an option: ");
			System.out.printf("*********************\n");
			option = scanner.next().charAt(0);

			switch (option){
				case 'A':
					System.out.printf("*********************");
					System.out.printf("Balance: " + balance);
					System.out.printf("*********************\n");
					break;
				case 'B':
					System.out.printf("*********************");
					System.out.printf("Enter an amount to deposit: ");
					System.out.printf("*********************\n");
					int amountToDeposit = scanner.nextInt();
					deposit(amountToDeposit);
					System.out.printf("\n");
					break;
				case 'C':
					System.out.printf("*********************");
					System.out.printf("Enter an amount to withdraw: ");
					System.out.printf("*********************\n");
					int amountToWithdraw = scanner.nextInt();
					withdraw(amountToWithdraw);
					System.out.printf("\n");
					break;
				case 'D':
					System.out.printf("*********************");
					getPreviousTransaction();
					System.out.printf("*********************\n");
					System.out.printf("\n");
					break;
				default:
					System.out.printf("Invalid Option!!. Please enter again...");
			}

		}while (option != 'E');
	}

}
