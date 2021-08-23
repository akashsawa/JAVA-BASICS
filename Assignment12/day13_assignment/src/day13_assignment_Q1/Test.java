package day13_assignment_Q1;

import static day13_assignment_Q1.Books.sdf;
import static day13_assignment_Q1.CollectionUtils.*;
import static day13_assignment_Q1.ValidationUtils.*;
import java.util.HashMap;
import java.util.Scanner;

public class Test 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch;
		HashMap<String,Books>map=populateMap(populateSampleData());
		while((ch=menuList())!=0)
		{
			try 
			{
			switch(ch)
			{
			//String title, double price, Date date, category category, String authorname, int quantity
				case 1:
					System.out.println("ENTER TITLE");
					String title=sc.next();
					if(map.containsKey(title))
					{
						System.out.println("DUPLICATE BOOK");
						System.out.println("ENTER QUANTITY");
						Books changequantity=map.get(title);
						changequantity.setQuantity(sc.nextInt());
						System.out.println("UPDATED...");
						break;
					}
					System.out.println("ENTER PRICE DATE CATEGORY AUTHORNAME QUANTITY");
					Books newBook=new Books(title,sc.nextDouble(),sdf.parse(sc.next()),convertType(sc.next()),sc.next(),sc.nextInt());
					map.put(title, newBook);
					break;
					
				case 2:
					for(Books b:map.values())
						System.out.println(b);
					break;
					
				case 3:
					System.out.println("ENTER TITLE");
					String titlekey=sc.next();
					if(map.containsKey(titlekey))
						System.out.println(map.get(titlekey));
					else
						System.out.println("NOT FOUND !!!");
					break;
				
				case 4:
					System.out.println("ENTER TITLE");
					String newtitlekey=sc.next();
					if(map.containsKey(newtitlekey))
					{
						Books updatetitle=map.get(newtitlekey);
						updatetitle.setQuantity(sc.nextInt());
					}
					else
						System.out.println("NOT FOUND !!!");
					break;
				
				case 5:
					System.out.println("ENTER TITLE");
					map.remove(sc.next());
					break;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	private static int menuList()
	{
		System.out.println("1. ADD BOOKS");
		System.out.println("2. DISPLAY ALL BOOKS");
		System.out.println("3. FIND BOOK ");
		System.out.println("4. RETURN A BOOK");
		System.out.println("5. REMOVE BOOK");
		return sc.nextInt();
	}

}
