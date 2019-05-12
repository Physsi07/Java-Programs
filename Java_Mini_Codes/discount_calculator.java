 import java.util.Scanner;
public class Main14
{
	public static void main(String[] args)
	{
		//Declare variables 
		int Quantity;
		double AmountOfTheDiscount = 0;
		double TotalAmount;
		double Paid;
		
		//Create a Scanner
		Scanner eraseble = new Scanner(System.in);
		
		//Ask for quantity
		System.out.println("Enter the number of quantity that you bought: ");
		
		//Get quantity
		Quantity = eraseble.nextInt();
		
		//Calculate how much it was paid
		Paid = Quantity * 99;
				

		//Calculate amount of the discount  
		if (Quantity < 10)
		{
			System.out.println("no discount available");
		}
		else if (Quantity >= 10 && Quantity <= 19)
		{
			AmountOfTheDiscount = Paid *.20;
			System.out.println("Your discount is: " + AmountOfTheDiscount);
		}
		else if (Quantity >= 20 && Quantity <= 49)
		{
			AmountOfTheDiscount = Paid *.30;
			System.out.println("Your discount is: " + AmountOfTheDiscount);
		}
		else if (Quantity >= 50 && Quantity <= 99)
		{
			AmountOfTheDiscount = Paid *.40;
			System.out.println("Your discount is: " + AmountOfTheDiscount);
		}
		else if (Quantity >= 100)
		{
			AmountOfTheDiscount = Paid *.40;
			System.out.println("Your discount is: " + AmountOfTheDiscount);
		}
		
		Paid = Quantity * 99 - AmountOfTheDiscount;
		
		//Calculate the Total Amount
		TotalAmount = Paid - AmountOfTheDiscount;
		
		//Display
		System.out.println("Your total amount is: " + TotalAmount);
		System.out.println("Your total payment is: " + Paid);
		
	}
}
