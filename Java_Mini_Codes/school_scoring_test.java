/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW1
 *P107: 10 
 ****************
 *Write a program that asks the user to 
 *enter three test scores. The program 
 *should display each test score, as well
 *as the average of the scores and letter grade.
 */
import java.util.Scanner;
public class Main5 
{
	public static void main(String[] args)
	{
		//Declare variables
		double TestScore1;
		double TestScore2;
		double TestScore3;
		double Adverage;
		double TotalAdverage;
		
		//Create a scanner
		Scanner skool = new Scanner(System.in);
		
		//Ask the user for 1st score
		System.out.println("Enter you first test score: ");
		
		//Get 1st score
		TestScore1 = skool.nextDouble();
		
		//Ask the user for 2nd score
		System.out.println("Enter you second test score: ");

		//Get 2nd score
		TestScore2 = skool.nextDouble();

		//Aske the user for 3rd score
		System.out.println("Enter you third test score: ");

		//Get 3rd score
		TestScore3 = skool.nextDouble();

		//Calculate adverage
		Adverage =  TestScore1 + TestScore2 + TestScore3 ;
		TotalAdverage = Adverage / 3;
		


		/*
		Determine letter grade
		Display each test score and adverage
		*/
		if (TotalAdverage >= 90 && TotalAdverage <= 100)
		{
			System.out.println("Your first test score was " + TestScore1);
			System.out.println("Your second test score was " + TestScore2);
			System.out.println("Your third test score was " + TestScore3);
			System.out.println("Your adverage is " + TotalAdverage);
			System.out.println("Your letter grade is A ");
		}	
		else if (TotalAdverage >= 80 && TotalAdverage <= 89)
		{
			System.out.println("Your first test score was " + TestScore1);
			System.out.println("Your second test score was " + TestScore2);
			System.out.println("Your third test score was " + TestScore3);
			System.out.println("Your adverage is " + TotalAdverage);
			System.out.println("Your letter grade is B ");
		}
		else if (TotalAdverage >= 70 && TotalAdverage <= 79)
		{
			System.out.println("Your first test score was " + TestScore1);
			System.out.println("Your second test score was " + TestScore2);
			System.out.println("Your third test score was " + TestScore3);
			System.out.println("Your adverage is " + TotalAdverage);
			System.out.println("Your letter grade is C ");
		}
		else if (TotalAdverage >= 60 && TotalAdverage <= 69 )
		{
			System.out.println("Your first test score was " + TestScore1);
			System.out.println("Your second test score was " + TestScore2);
			System.out.println("Your third test score was " + TestScore3);
			System.out.println("Your adverage is " + TotalAdverage);
			System.out.println("Your letter grade is D ");
		}
		else if (TotalAdverage < 60 )
		{
			System.out.println("Your first test score was " + TestScore1);
			System.out.println("Your second test score was " + TestScore2);
			System.out.println("Your third test score was " + TestScore3);
			System.out.println("Your adverage is " + TotalAdverage);
			System.out.println("Your letter grade is F ");
		}
		
	}
}