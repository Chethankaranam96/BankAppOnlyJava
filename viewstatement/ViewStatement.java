package viewstatement;
import java.util.*;
public class ViewStatement
{
	public int viewstatementmodule()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Account Number: ");
		long n = sc.nextLong();
		Calendar date = Calendar.getInstance();
		System.out.println("Account Statement as on today's date:"+date.get(Calendar.DAY_OF_MONTH)+"/"+ (date.get(Calendar.MONTH)+1) +"/"+date.get(Calendar.YEAR));
		
		System.out.println("Account Balance:200000 INR \n");
		System.out.println("---------------------------------------------------");
		System.out.println("Date       Transcation         Debit/Credit  Amount");
		System.out.println("---------------------------------------------------");
		System.out.println("12/10/23   Dmart payment       Debit         7000");
		System.out.println("19/10/23   Irctc  payment      Debit         890");
		System.out.println("20/10/23   Money Received      Credit        2000");
		System.out.println("22/10/23   Bookmyshow payment  Debit         500");
		System.out.println("29/10/23   Flipkart refund     Credit        3000");
		
		
	
		System.out.println("\nEnter option '7' to Repeat main options or Enter '6' to exit");
		int input = sc.nextInt();
		return input;
	}
}