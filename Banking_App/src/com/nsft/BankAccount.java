package com.nsft;

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
		char answer = ' ';
		System.out.printf("Welcome " + clientName + "\n");
		System.out.printf("Your ID is " + clientID + "\n");
		System.out.printf("A. Check Balance\n");
		System.out.printf("B. Deposit\n");
		System.out.printf("C. Withdraw\n");
		System.out.printf("D. Previous Transaction\n");
		System.out.println("E. Exit");
		System.out.println();

		do{
			System.out.print("Enter an option: ");
			answer = scanner.next().charAt(0);
			char option = Character.toUpperCase(answer);


			switch (option){
				case 'A':
					System.out.println("Balance: " + balance);
					break;
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int amountToDeposit = scanner.nextInt();
					deposit(amountToDeposit);
					System.out.println();
					break;
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int amountToWithdraw = scanner.nextInt();
					withdraw(amountToWithdraw);
					System.out.println();
					break;
				case 'D':
					getPreviousTransaction();
					System.out.println();
					break;
				default:
					System.out.println("Invalid Option!!. Please enter again...");
			}

		}while (answer != 'E');
	}

}
