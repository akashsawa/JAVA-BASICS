package tester;

import static Studentclass.Coursetype.*;
import static utils.ValidationUtils.checkByGPA;
import static utils.ValidationUtils.checkByPassword;
import static utils.ValidationUtils.correctPNR;
import static utils.ValidationUtils.correctemail;
import static utils.ValidationUtils.validCustomer;
import static utils.ValidationUtils.validDate;

import java.util.ArrayList;

import Studentclass.Customer;

public class collectionUtils 
{
	public static ArrayList<Customer> populateSampleData() throws Exception
	{
		ArrayList<Customer>list=new ArrayList<>();
		try
		{
			list.add(new Customer("abc123","PRAMOD","PRAMOD@GMAIL.COM", "PRAMOD", 6,validDate("12-08-2001") ,DBT));
			list.add(new Customer("pqr777","AMOL","AMOL@GMAIL.COM", "AMOL", 8,validDate("22-10-2009") ,REST));
			list.add(new Customer("lmn145","SHIVA","SHIVA@GMAIL.COM", "SHIVA", 5,validDate("08-02-2015") ,HIBERNATE));
			list.add(new Customer("xyz789","MANOJ","MANOJ@GMAIL.COM", "MANOJ", 2,validDate("19-04-2011") ,DBT));
			list.add(new Customer("kij333","BILAL","BILAL@GMAIL.COM", "BILAL", 10,validDate("26-12-2019") ,REACT));
			list.add(new Customer("cde444","RAM","RAM@GMAIL.COM", "RAM", 3,validDate("11-09-2021") ,DBT));

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
