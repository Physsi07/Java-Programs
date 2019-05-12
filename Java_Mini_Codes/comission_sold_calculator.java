/*Starlyn Urena
 *Prof. Persuad
 *CIS 110
 *02/18/15
 ****************
 *HW
 *P108: 17
 ****************
 */
public class Main10 
{
	public static void main(String[] args)
	{
		//Declare variables
		int StockPurchased = 1000;
		int StockSold = 1000;
		double PaidPerShare = 32.87;
		double SoldPerShare = 33.92;
		double StockBrokerCommision= 0.02;
		double PaidforStock;
		double SoldForStock;
		double AmountOfPaidCommission;
		double AmountOfSoldCommission;
		double Profit;
		
		
		//Calcuate the money paid for stock
		PaidforStock = StockPurchased * PaidPerShare;
		
		//Calculate the commision paid
		AmountOfPaidCommission = PaidforStock * StockBrokerCommision;
		
		//Calculate  the money sold for stock
		SoldForStock = StockSold * SoldPerShare;
		
		//Calculate the commision sold
		AmountOfSoldCommission = SoldForStock * StockBrokerCommision;
		
		//Calculate the profit
		Profit = SoldForStock - PaidforStock - AmountOfPaidCommission - AmountOfSoldCommission ;
		
		//Display
		System.out.println("The amount of money Joe paid for the stock: " + PaidforStock);
		System.out.println("The amount of commission Joe paid his broker when he bought the stock: " + AmountOfPaidCommission);
		System.out.println("The amount of money Joe sold for the stock: " + SoldForStock);
		System.out.println("The amount of commission Joe sold his broker when he bought the stock: " + AmountOfSoldCommission);
		System.out.println("The profit of Joe was: " + Profit + ", Joe lost money");

	}
}
