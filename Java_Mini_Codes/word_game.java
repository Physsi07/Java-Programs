/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW
 *P108: 16
 ****************
 Write a program that plays a word game with the user. The program should ask the user to enter the following:
His or her name
His or her age
The name of a city
The name of a college
A profession
A type of animal
A pet's name
After the user has entered these items, ihe program should display the following story, inserting the users input into the appropriate locations:
There once was a pcrion named MAME who lived in CUT. At the age of AQE, NAME went to college at COLLEGE- NAME graduated and went to work as a
PROFESSION. Then, NAME adopted a<n) ANIMAL naned PETNAME. They both lived happily ever after!
*/
import java.util.Scanner;
public class Main9
{
	public static void main(String[] args)
	{
		//Declare variables
		int age;
		String name;
		String city;
		String college;
		String profession;
		String typeofanimal;
		String animalsname;
		
		//Create a scanner
		Scanner toy = new Scanner(System.in);
		
		//Ask for user name
		System.out.println("What's your name ?");
		
		//Get name
		name = toy.nextLine();
		
		//Ask for user city
		System.out.println("What city are you from ?");
		
		//Get city
		city = toy.nextLine();
		
		//Ask user for age
		System.out.println("How old are you ?");
		
		//Get age
		age = toy.nextInt();
		
		//Ask for user college 
		System.out.println("What college do you go to ?");
		
		//Get college
		college = toy.next();
		
		//Ask for user profession
		System.out.println("What's you profession ?");
		
		//Get profession
		profession = toy.next();
		
		//Ask for a type of animal
		System.out.println("Give me a type of animal ?");
		
		//Get type of animal
		typeofanimal = toy.next();
		
		//Ask for animals name
		System.out.println("What's the animal name ?");
		
		//Get animal name
		animalsname = toy.next();
		
		//Display it
		System.out.println("There once was a person named " + name + " who lived in " + city +".");
		System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ", graduated ");
		System.out.println("and went to work as a " + profession + ". Then, " + name + " adopted a " + typeofanimal);
		System.out.println("named " + animalsname + ". They both lived happily ever after!");
		
	}

}
