package complaints;
import java.util.*;
public class Complaints
{
	public int complaintsmodule()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number: ");
		long n = sc.nextLong();
		System.out.println("Enter your mobile number: ");
		long n1 = sc.nextLong();
		System.out.println("Enter Your complaint: ");
		sc.next();
		String s = sc.nextLine();
		
		System.out.print("Thanks..one of our representative will contact you shortly \r\n"
				+ "regarding this complaint.. \n");
		
		System.out.println("\nEnter option '7' to Repeat main options or Enter '6' to exit");
		int input = sc.nextInt();
		return input;
	}
	
}