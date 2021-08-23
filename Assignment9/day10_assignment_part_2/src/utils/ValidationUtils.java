package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import day8_assignment.Coursetype.*;
import CustomerHandelingException.*;
import day8_assignment.Customer;
import day8_assignment.Coursetype;
import day8_assignment.*;
import static day8_assignment.Customer.*;
public class ValidationUtils 
{
	private static Scanner sc=new Scanner(System.in);
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
	public static Coursetype validCustomer(String str) throws Exception
	{
		try 
		{
			return Coursetype.valueOf(str.toUpperCase());// IllegalArgumentException : un chked
		}
		catch (IllegalArgumentException e) 
		{
			StringBuilder sb = new StringBuilder("Invalid Category chosen!!!!! \n Available Categories : ");
			sb.append(Arrays.toString(Coursetype.values()));
			throw new CustomeException(sb.toString());
		}
		
	}
	public static String correctPNR(String pnr,ArrayList<Customer>studentlist) throws Exception
	{
		if(studentlist.contains(new Customer(pnr)))
			throw new CustomeException("DUPLICATE RECORD FOUND !!!");
		return pnr;
	}
	
	public static String correctemail(String str,ArrayList<Customer> customerList) throws Exception
	{
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		if(str.matches(regex))
		{
				return str;
		}
		else
		{
			CustomeException exc=new CustomeException("WRONG EMAIL !");
			throw exc;
		}
		
	}
//	public static boolean searchEmail(String str,ArrayList <Customer>customerList) throws Exception
//	{
//		Customer checkEmail=new Customer(str);
//		if(customerList.contains(checkEmail))
//			return true;
//		else
//			return false;
//	}

	public static String checkByPassword(String pass) throws Exception
	{
		if(pass.length()<4 || pass.length()>11)
		{
			throw new CustomeException("PASSWORD MUST BE BETWEEN 4-10");
		}
		return pass;
			
	}
	public static double checkByGPA(double amt) throws Exception
	{
		if(amt<=0)
		{
			throw new CustomeException("GPA CANNOT BE 0 OR -VE !!!");
		}
		return amt;
			
	}
	
	public static void removeStudent(ArrayList<Customer>studentList)throws Exception
	{
		System.out.println("ENTER PRN: ");
		String rem=sc.next();
		Customer remove=new Customer(rem);
		int removeindex=studentList.indexOf(remove);
		if(studentList.remove(removeindex) != null)
			System.out.println("DELETED SUCESSFULLY !!!");
		else
			throw new CustomeException("STUDENT DOESN'T EXIST !");
	}
	
}


