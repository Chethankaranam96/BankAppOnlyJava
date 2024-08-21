import java.util.*;
import moneytransfer.*;
import paybills.Paybills;
import viewstatement.*;
import complaints.*;
import profile.*;

class Menu
{
	public static void options()
	{
		System.out.println("--->  Please enter the below options to proceed further");
		System.out.println("      1) Perform Money Transfer");
		System.out.println("      2) Pay Bills ");
		System.out.println("      3) View Account statement");
		System.out.println("      4) Raise any complaints ");
		System.out.println("      5) View profile Details ");
		System.out.println("      6) Exit Application ");
	}
}
public class Bankmain
{
	public static void main(String[] args)throws Exception
	{
		Menu.options();
		Scanner in = new Scanner(System.in);	
		System.out.println("\nEnter your choice: ");
		int n = in.nextInt();
		
		switch(n)
		{
			case 1:
			{
				
				MoneyTransfer obj = new MoneyTransfer();
				int res = obj.moneytransfermodule();
				if(res==6)
				{
					System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
					break;
				}
				else if(res==7)
				{
					main(args);
					break;					
				}
				else
				{
					System.out.println("INVALID CHOICE !!!");
					System.out.println("TRY AGAIN........ ");
					main(args);
					break;
				}			
			}
			case 2:
			{
				Paybills obj1 = new Paybills();
				int res = obj1.paybillsmodules();
				if(res==6)
				{
					System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
					break;
				}
				else if(res==7)
				{
					main(args);
					break;					
				}
				else
				{
					System.out.println("INVALID CHOICE !!!");
					System.out.println("TRY AGAIN........ ");
					main(args);
					break;
				}
			}
			case 3:
			{
				ViewStatement obj2= new ViewStatement();
				int res = obj2.viewstatementmodule();
				if(res==6)
				{
					System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
					break;
				}
				else if(res==7)
				{
					main(args);
					break;					
				}
				else
				{
					System.out.println("INVALID CHOICE !!!");
					System.out.println("TRY AGAIN........ ");
					main(args);
					break;
				}
			}
			case 4:
			{
				Complaints obj3 = new Complaints();
				int res = obj3.complaintsmodule();
				if(res==6)
				{
					System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
					break;
				}
				else if(res==7)
				{
					main(args);
					break;					
				}
				else
				{
					System.out.println("INVALID CHOICE !!!");
					System.out.println("TRY AGAIN........ ");
					main(args);
					break;
				}
			}
			case 5:
			{
				Profile obj4 = new Profile();
				int res = obj4.profiledetails();
				if(res==6)
				{
					System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
					break;
				}
				else if(res==7)
				{
					main(args);
					break;					
				}
				else
				{
					System.out.println("INVALID CHOICE !!!");
					System.out.println("TRY AGAIN........ ");
					main(args);
					break;
				}
				
			}
			case 6:
			{
				System.out.println("\n^^^^^ Thank you for Banking with us ^^^^^");
				break;
			}
			case 7:
			{
				main(args);
				break;
			}
			default :
			{
				System.out.println("INVALID CHOICE !!!");
				System.out.println("TRY AGAIN........ ");
				main(args);
				break;
			}
		}
		
		
	}
}