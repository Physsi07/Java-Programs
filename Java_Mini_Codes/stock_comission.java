/*Write a program that calculates and displays the following:
 *The amount paid for the stock alone iwithout the commission) 
 *The amount of the commission
 *The total amount paid (for the stock plus the commission)
 */
public class Main4 
{
	public static void main(String[] args)
	{
		//Declare variables
		double share;
		double price;
		double commision;
		double totalbeforecom;
		double totalaftercom;
		double crate;
		
		//Assing values to variables
		share = 600;
		price = 21.77;
		crate = .02;
		
		//Calculate totalbeforecom
		totalbeforecom = share * price;
		
		//Calculate commision
		commision = crate * totalbeforecom;
		
		//Calculate totalaftercom
		totalaftercom = commision + totalbeforecom;
		
		//Display all calculations
		System.out.println("Your total before commision is: " + totalbeforecom);
		System.out.println("Your commision is: " + commision);
		System.out.println("Your total after commision is: " + totalaftercom);	
		
		
	}

}
