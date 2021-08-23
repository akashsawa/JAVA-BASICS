package Studentclass;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer>
{
	public int compare(Customer c1,Customer c2)
	{
		if(c1.getGpa()<c2.getGpa())
			return -1;
		if(c1.getGpa()>c2.getGpa())
			return 1;
		return 0;
//		return ((Double)c1.getGpa()).compareTo(c2.getGpa());
	}
}
