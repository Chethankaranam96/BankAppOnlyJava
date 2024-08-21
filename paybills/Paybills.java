package paybills;
import java.util.*;
public class Paybills 
{

	public int paybillsmodules()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile operator to paybills: ");
		String s = sc.nextLine();
		System.out.println("Enter your mobile number: ");
		long n = sc.nextLong();
		System.out.println("Enter Amount: ");
		long n1= sc.nextLong();
		System.out.println("Enter Debit/credit card number: ");
		long n2=sc.nextLong();
		System.out.println("Enter CVV number: ");
		int n3=sc.nextInt();
		System.out.println("Enter expiry date: ");
		sc.next();
		String s1=sc.nextLine();
		
		System.out.println("\nCongratulations your bill payment is successfull..");
		System.out.println("\nEnter option '7' to Repeat main options or Enter '6' to exit");
		int input = sc.nextInt();
		return input;
	}

}
