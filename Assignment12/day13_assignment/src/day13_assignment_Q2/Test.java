package day13_assignment_Q2;

import static day13_assignment_Q1.Books.sdf;
import static day13_assignment_Q1.ValidationUtils.*;
import java.util.HashSet;
import java.util.Scanner;

import day13_assignment_Q1.Books;

public class Test 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		HashSet<Books>set=new HashSet<>();
		System.out.println("ENTER COUNT: ");
		int count=sc.nextInt(),i;
		try
		{
		for(i=0;i<count;i++)
		{
			System.out.println("ENTER PRICE DATE CATEGORY AUTHORNAME QUANTITY");
			Books book=new Books(sc.next(),sc.nextDouble(),sdf.parse(sc.next()),convertType(sc.next()),sc.next(),sc.nextInt());
			set.add(book);
		}
		System.out.println(set);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
