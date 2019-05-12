import java.util.Scanner;
public class Main11 
{
	public static void main (String[] args)
	{
		//Declare variables
		int Month;
		int Day;
		int Year;
		
		//Create a scanner object
		Scanner PNY = new Scanner(System.in);
		
		//Ask for month
		System.out.println("Enter a month: ");
		
		//Get month
		Month = PNY.nextInt();
		
		//Ask for day
		System.out.println("Enter a day: ");
		
		//Get day
		Day = PNY.nextInt();
		
		//Ask for year
		System.out.println("Enter a year: ");
		
		//Get year
		Year = PNY.nextInt();
		
		//Determine magic date
		if ( Month * Day == Year)
			System.out.println("The date is magic");
		else
			System.out.println("This is not a magic date");
	}

}
