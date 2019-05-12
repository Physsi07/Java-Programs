/*
 * write a program that asks the user (or the number of 
 * miles driven and the gallons of gas used. It should 
 * calculate the car's miles-per-gallon and display the
 *result on the screen.
 */

import java.util.Scanner;
public class Main3 
{
    public static void main(String[] args)
    {
    	//Declare variables
    	double miles;
    	double gas;
    	double mpg;
    	
    	//Create a scanner object
    	Scanner sonic = new Scanner(System.in);
    	
    	//Ask user for miles
    	System.out.println("How much miles did you drive ?");
    	
    	//Accept user miles
    	miles = sonic.nextDouble();
    	
    	//Ask user for gas
    	System.out.println("How much gas did you used ?");
    	
    	//Accept user gas
    	gas = sonic.nextDouble();
    	
    	//Calculate MPG
    	mpg = miles / gas;
    			
    	//Display MPG
    	System.out.println("The miles per gallon that were used was " + mpg);

    	
    	
    }
	
	
	
}
