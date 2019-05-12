import java.util.Scanner;
public class Main12
{
	public static void main(String[] args)
	{
	//Declare variables
	int number;
	
	//create a scanner
	Scanner Roman = new Scanner(System.in);
	
	//Ask for number
	System.out.println("Enter a number:");
	
	//Get number
	number = Roman.nextInt();
	
	//Convert number to roman numeral
	 	if (number == 1)
	 	{
		 	System.out.println("the roman numeral is: I");
		}
	 	else if (number == 2)
		{
			System.out.println("the roman numeral is: II");
		}
		else if (number == 3)
		{
			System.out.println("the roman numeral is: III");
		}
		else if (number == 4)
		{
			System.out.println("the roman numeral is: IV");
		}
		else if (number == 5)
		{
			System.out.println("the roman numeral is: V");
		}
		else if (number == 6)
		{
			System.out.println("the roman numeral is: VI");
		}
		else if (number == 7)
		{
			System.out.println("the roman numeral is: VII");
		}
		else if (number == 8)
		{
			System.out.println("the roman numeral is: VIII");
		}
		else if (number == 9)
		{
			System.out.println("the roman numeral is: IX");
		}
		else if (number == 10)
		{
			System.out.println("the roman numeral is: X");
		}
	
	}
 }