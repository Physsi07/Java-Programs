 /*the ecs company generates 62 percent(0.62) of total sales.
  *The program will predict how much the company generates 
  *if it has $4.6 million in sales
  */

public class main 
{	
 public static void main(String[] args)
 {
	
 double ecs; // ecs is declared as a variable with decimals
 double ecd; // ecd is declared as a variable with decimals
 double total; //Total has been declared
 ecs = 4.6000000; //A value that has been assing to the declared variable, ecs
 ecd = 0.62; //A value has been assing to ecd
	
 total = ecs * ecd;//An equation that calculates the total sales
	
 System.out.println("The company generates " + total +" millions in total sales");
 //This is outputting the prediction of the company

 }	
}

