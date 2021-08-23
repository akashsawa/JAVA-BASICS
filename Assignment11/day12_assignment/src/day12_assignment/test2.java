package day12_assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

////3.3 Write a generic method to accept ANY type of the collection(any list or any set) of numbers 
//(ints/double/float) n return it's sum
//3.4 Write a generic method to accept ANY type of the list of numbers  &   add the specified number to the list. 
//(For understanding PECS)
public class test2 {

	public static void main(String[] args) 
	{
		Set<Integer>newset=new HashSet<>();
		newset.add(10);
		newset.add(20);
		newset.add(30);
		System.out.println("SUM: "+printsum(newset));
		
		
		HashSet <Double>hs=new HashSet<>(Arrays.asList(10.2,20.4,30.9,4.12));
		System.out.println("SUM USING HASHSET OF DOUBLE VALUES: "+printsum1(hs));
		
		
		
	}
	public static double printsum(Collection <? extends Number> listofnumbers)
	{
		double sum=0;
		Iterator<? extends Number>itr=listofnumbers.iterator();
		while(itr.hasNext())
			sum+=itr.next().intValue();
		return sum;
	}
	public static <T extends Number>double printsum1(Collection <T> listofnumbers2)
	{
		double sum=0;
		Iterator<T>itr=listofnumbers2.iterator();
		while(itr.hasNext())
			sum+=itr.next().doubleValue();
		return sum;
	}
	
	
}
