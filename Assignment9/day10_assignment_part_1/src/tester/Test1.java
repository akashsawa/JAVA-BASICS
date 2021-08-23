package tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import CustomerHandelingException.CustomeException;

import static utils.ValidationUtils.*;
import day8_assignment.Customer;

public class Test1 {
	//private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in)) 
		{
			//System.out.println("ENTER NUMBER OF CUSTOMERS: ");
			int ch;
			
			ArrayList<Customer>customerList=new ArrayList<>();
			while((ch=menuList())!=0)
			{
				try
				{
					switch(ch)
					{
						case 1:
							System.out.println("ENTER CUSTOMER DETAILS: NAME, EMAIL,PASSWORD, REGISTERATION AMOUNT,DATE OF BIRTH, CUSTOMER TYPE");
							Customer newCustomer=new Customer(sc.next(), correctemail(sc.next(),customerList), checkByPassword(sc.next()), checkByAmount(sc.nextDouble())
									,validDate(sc.next()) , validCustomer(sc.next()));
							customerList.add(newCustomer);
							
							break;
						case 2:
							System.out.println("CUSTOMER DETAILS: ");
							System.out.println("*******************************");
							for(Customer c:customerList)
							{
								System.out.println(c.toString());
							}
							break;
						case 3:
							System.out.println("ENTER EMAIL: ");
							String str=sc.next();
							Customer checkEmail=new Customer(str);
							int index=customerList.indexOf(checkEmail);
							if(index!=-1)
							{
								System.out.println("ENTER NEW PASSWORD: ");
								String newPassword = sc.next();
								Customer temp = customerList.get(index);
								temp.setPassword(newPassword);							
								System.out.println("UPDATED ");
							}
							else
								System.out.println("CUSTOMER NOT FOUND !!!");
								//System.out.println("USER FOUND !");
//							if(searchEmail(str,customerList))
//							{
//								System.out.println("ACCOUNT PRESENT !");
//								System.out.println("ENTER NEW PASSWORD");
//								String pass=sc.next();
//								
//							}
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
		System.out.println("3. UPDATE PASSWORD");
		System.out.println("0. EXIT");
		return sc.nextInt();
		
	}
	public static boolean changePassword(String str) throws Exception
	{
		
		return false;
	}
	

}
