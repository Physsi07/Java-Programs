// CALCULATING THE BMI OF A PERSON AND CHECHING IF THE ARE UNDERWEIGHT OR OVRWIGHT //


import java.util.*;
public class Main13
{
	public static void main (String[] args)
	{
		//declare variables
		double BMI;
		double Weight;
		double Height;
		
		//Create a scanner
		Scanner ntb = new Scanner(System.in);
		
		//Ask for weight
		System.out.println("Enter your body weight: ");
		
		//Get weight
		Weight = ntb.nextDouble();
		
		//Ask for height
		System.out.println("Enter your body height: ");
		
		//Get height
		Height = ntb.nextDouble();
		
		//calculate body mass index
		BMI = Weight * 703 / (Height * Height);
		
		if (BMI > 18.5 && BMI < 25)
		{
			System.out.println("Your body mass index is " + BMI);
			System.out.println("You have optional weight");
		}
		else if (BMI < 18.5)
		{
			System.out.println("Your body mass index is " + BMI);
			System.out.println("You are consider underweight");
		}
		if (BMI > 25)
		{
			System.out.println("Your body mass index is " + BMI);
			System.out.println("You are consider overweight");
		}
	}
}