package day13_assignment_Q2;
import static day13_assignment_Q1.Books.*;
import java.text.ParseException;
import java.util.Date;


public class ValidationUtils 
{
	
	public static Date convertDate(String str) throws ParseException
	{
		Date date=sdf.parse(str);
		return date;
	}
	public static category1 convertType(String bookType) throws Exception
	{
		return category1.valueOf(bookType.toUpperCase());
	}
}
