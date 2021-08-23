package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import day8_assignment.Customertype.*;
import CustomerHandelingException.*;
import day8_assignment.Customer;
import day8_assignment.Customertype;
import day8_assignment.*;
import static day8_assignment.Customer.*;
public class ValidationUtils 
{
	private static Date date;
	static
	{
		try
		{
			date=sdf.parse("1-1-2000");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Date validDate(String str) throws Exception
	{
		Date newdate =sdf.parse(str);
		if(dateCheck(newdate))
			return newdate;
		else throw new CustomeException("DOB IS BEFORE 1-1-2000 NOT ACCEPTED!!!");
		
	}
	
	public static boolean dateCheck(Date newdate)
	{
		if(newdate.before(date))
			return false;
		return true;
	}
	public static Customertype validCustomer(String str) throws Exception
	{
		try 
		{
			return Customertype.valueOf(str.toUpperCase());// IllegalArgumentException : un chked
		}
		catch (IllegalArgumentException e) 
		{
			StringBuilder sb = new StringBuilder("Invalid Category chosen!!!!! \n Available Categories : ");
			sb.append(Arrays.toString(Customertype.values()));
			throw new CustomeException(sb.toString());
		}
		
	}
	
	public static String correctemail(String str,ArrayList customerList) throws Exception
	{
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		if(str.matches(regex))
		{
			if(searchEmail(str, customerList) && customerList!=null)
			{
				throw new CustomeException("DUPLICATE RECORD FOUND !!! .... ENTER AGAIN !");
			}
			
			else
				return str;
			
		}
		else
		{
			CustomeException exc=new CustomeException("WRONG EMAIL !");
			throw exc;
		}
		
	}
	public static boolean checkDuplication(String str,ArrayList customerList) throws Exception
	{
		for(Object c:customerList)
		{
			if(searchEmail(str, customerList))
				return true;
		}
		return false;
	}
	public static String checkByPassword(String pass) throws Exception
	{
		if(pass.length()<4 || pass.length()>11)
		{
			throw new CustomeException("PASSWORD MUST BE BETWEEN 4-10");
		}
		return pass;
			
	}
	public static double checkByAmount(double amt) throws Exception
	{
		if(amt%500!=0)
		{
			throw new CustomeException("AMOUNT MUST BE MULTIPLE OF 500 !!!");
		}
		return amt;
			
	}
	public static boolean searchEmail(String str,@SuppressWarnings("rawtypes") ArrayList customerList) throws Exception
	{
		Customer checkEmail=new Customer(str);
		if(customerList.contains(checkEmail))
			return true;
		else
			return false;
	}
	
}


