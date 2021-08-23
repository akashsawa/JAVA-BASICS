package tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.event.MenuListener;

import static utils.ValidationUtils.*;
import day8_assignment.Customer;

public class Test1 {
	//private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in)) 
		{
			System.out.println("ENTER NUMBER OF CUSTOMERS: ");
			int inputcount=sc.nextInt();
			Customer customer[]=new Customer[inputcount];
			int ch,counter=0;
			while((ch=menuList())!=0 && counter<inputcount)
			{
				try
				{
					switch(ch)
					{
						case 1:
							System.out.println("ENTER CUSTOMER DETAILS: NAME, EMAIL,PASSWORD, REGISTERATION AMOUNT,DATE OF BIRTH, CUSTOMER TYPE");
							customer[counter++]=new Customer(sc.next(), correctemail(sc.next(),customer), checkByPassword(sc.next()), checkByAmount(sc.nextDouble())
									,validDate(sc.next()) , validCustomer(sc.next()));
							break;
						case 2:
							System.out.println("CUSTOMER DATAILS: ");
							System.out.println("*******************************");
							for(Customer c:customer)
							{
								if(c!=null)
									System.out.println(c.toString());
							}
							break;
					}
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}

			}
							
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	private static int menuList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ADD DETAILS: ");
		System.out.println("2. DISPLAY DETAILS: ");
		System.out.println("0. EXIT");
		return sc.nextInt();
		
	}
	

}
