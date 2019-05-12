/*The program will calculate the number of acres 
 * in a tract of land with 389,767 square feet.
 */

public class Main2 
{
 public static void main (String[] args)
 {

 double oneacreofland; //A variable called "oneacreofland" that contains decimals
 double atractofland; //A variable called "atractofland" that contains decimals
 double numberofacresinthetract; //A variable called "numberofacresinthetract" that contains decimals
 oneacreofland = 43560; //A value that was assing to the variable
 atractofland = 389767; //A value that was assing to another variable
		
 numberofacresinthetract = atractofland / oneacreofland; //An equation that calculates the # of acres
		
 System.out.println("The number of acres that were found in the tract " +
 "were " + numberofacresinthetract + " square feet"); //this will output the result
		
 }
}
