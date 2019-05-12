/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW
 *P105: 2
 ****************
 *Write a program that has the following String 
 *variables: firstNane, middleName, and lastName. 
 *Initialize these with your first, middle, and
 *last names. The program should also have the
 *following char variables: firstlnitial, 
 *middlelnitial, and lastlnitial. Store your
 *first, middle, and last initials in these 
 *variables. The program should display the
 *contents of these variables on the screen.
 */
import java.util.Scanner;
public class Main7 
{
	public static void main(String[] args )
	{
		//Declare variables
		String firstName;
		String middleName;
		String lastName;
		char firstInitial;
		char middleInitial;
		char lastInitial;
		
		//Create a scanner
		Scanner platform = new Scanner(System.in);
		
		//Ask user for first name
		System.out.println("What is your first name ?");
		
		//Get firstName
		firstName = platform.nextLine();
		
		//Ask the user for middle name
		System.out.println("What is your middle name ?");
		
		//Get middleName
		middleName = platform.nextLine();
		
		//Ask the user for last name
		System.out.println("What is your last name ?");
		
		//Get lastName
		lastName = platform.nextLine();
		
		//Get firtInitial
		firstInitial = firstName.charAt(0);
		
		//Get middleInitial
		middleInitial = middleName.charAt(0);
		
		//Get lastInitial
		lastInitial = lastName.charAt(0);
		
		//Display >firstInitial >firstInitial >lastInitial
		System.out.println("Your first initial is: " + firstInitial);
		System.out.println("Your middle initial is: " + middleInitial);
		System.out.println("Your last initial is: " + lastInitial);
	}
}
