/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW
 *P107: 15
 ****************
 A soft drink company recently surveyed 
 12,467 of its customers and found that 
 approximately 14 percent of those surveyed 
 purchase one or more energy drinks per week.
 Of those customers who purchase energy 
 drinks, approximately 64 percent of them 
 prefer citrus flavored energy drinks. Write 
 a program that displays the following:
 ¥ The approximate number of customers in the survey who purchase one or more energy drinks per week
 ¥ The approximate number of customers in the survey who prefer citrus-flavored energy drinks
 */
public class Main8
{
	public static void main(String[] args)
	{
	//Declare variables
	double costumers;
	double costumersthatdrink;
	double costumersthatprefercitrus;
	
	//Assing value to variables
	costumers = 12467;
	
	//Calculate costumer who puchase one or more energy drinks
	costumersthatdrink = costumers * 0.14;
	
	//Calculate costumer that prefer citrus
	costumersthatprefercitrus = costumersthatdrink * 0.64;
	
	//Display them
	System.out.println("The number of costumers in the survey who purchase one or more energy drinks per week is: " + costumersthatdrink);
	System.out.println("The number of costumers in the survey who prefer citrus-flavored energy drinks is: " + costumersthatprefercitrus);
	}
}
