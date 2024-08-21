package profile;
import java.util.*;
public class Profile
{
	public int profiledetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Account Holder Name          : Chethan");
		System.out.println("Account Holder Account Type  : Savings Account");
		System.out.println("Account Holder Branch Address: Sanjeev reddy nagar,Hyderabad ");
		
		
		System.out.println("\nEnter option '7' to Repeat main options or Enter '6' to exit");
		int input = sc.nextInt();
		return input;
	}
}