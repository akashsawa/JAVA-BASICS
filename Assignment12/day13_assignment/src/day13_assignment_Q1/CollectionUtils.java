package day13_assignment_Q1;

import static day13_assignment_Q1.ValidationUtils.*;
import static day13_assignment_Q1.category.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionUtils
{
	public static ArrayList <Books> populateSampleData()
	{
		ArrayList <Books> list=new ArrayList<Books>();
		//String title, double price, Date date, Enum category, String authorname, int quantity
		try 
		{
			list.add(new Books("AKASH",150,convertDate("15-08-2001"),SCIFI,"AKASH",10));
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public static HashMap<String,Books> populateMap(ArrayList<Books> books)
	{
		HashMap<String, Books> map=new HashMap<>();
		for(Books a : books) 
			System.out.println("Added "+map.put(a.getTitle(),a));
		return map;
	}
}
