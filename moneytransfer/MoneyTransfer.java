package moneytransfer;
import java.util.*;
public class MoneyTransfer
{
	public int moneytransfermodule()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Account Number: ");
		long n = sc.nextLong();
		System.out.println("Enter Beneficiary Bank Name: ");
		String s = sc.next();
		System.out.println("Enter Beneficiary Account Number ");
		long n1=sc.nextLong();
		System.out.println("Enter Beneficiary IFSC code: ");
		String s1 = sc.next();
		System.out.println("Enter Amount to transfer: ");
		long n2=sc.nextLong();
		
		System.out.println("Congratulations..Your money is transfered successfully.... ");
		
		System.out.println("\nEnter option '7' to Repeat main options or Enter '6' to exit");
		int input = sc.nextInt();
		return input;
	}
}