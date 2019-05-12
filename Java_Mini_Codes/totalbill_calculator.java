/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW1
 *P107: 13
 ****************
 *Write a program that computes the tax and 
 *tip on a restaurant bill. The program should 
 *ask the user to enter the charge for the meal.
 *The tax should be 6.75 percent of the meal
 *charge. The tip should be 15 percent of
 *the total after adding the tax. Display
 *the meal charge, tax amount, tip amount,
 *and total bill on the screen.
 */
import java.util.Scanner;
public class Main6 
{
	public static void main(String[] args)
	{
		//Dleclare variables
		double ChargeofMeal;
		double ChargeofMealafterTax;
		double Tax; 
		double TaxoftheMeal;
		double Tip;
		double Tipafteraddingthetax;
		double TotalBill;
		
		//Assing value to variables
		Tax = 0.0675;
		Tip = 0.15;
		
		//Create a scanner
		Scanner food = new Scanner(System.in);
		
		//Ask the user for ChargeofMeal
		System.out.println("How much was the cost of your meal");
		
		//Get ChargeofMeal
		ChargeofMeal = food.nextDouble();
		
		//Calculate the tax of the meal
		TaxoftheMeal = ChargeofMeal * Tax;
		
		//Add the TaxoftheMeal and ChargeofMeal
		ChargeofMealafterTax = ChargeofMeal + TaxoftheMeal;
		
		//Calculate the tip after adding the tax
		Tipafteraddingthetax = Tip * ChargeofMealafterTax;
		
		//Calculate the TotalBill
		TotalBill = ChargeofMealafterTax + Tipafteraddingthetax;
		
		//Display >ChargeofMeal >TaxoftheMeal >Tipafteraddingthetax >TotalBill
		System.out.println("The meal charge was: " + ChargeofMeal );
		System.out.println("The tax amount was: " + TaxoftheMeal);
		System.out.println("The tip amount was: " + Tipafteraddingthetax);
		System.out.println("The total bill was: " + TotalBill);

	}
}
