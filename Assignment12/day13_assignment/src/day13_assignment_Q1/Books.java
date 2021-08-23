package day13_assignment_Q1;

import java.text.SimpleDateFormat;
import java.util.Date;
//1. Store book details in a library in hashing based data structure : HashSet
//Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
//Unique ID : book title
//Accept at least 5 book details from user & confirm if hash set is working in a correct manner.
public class Books 
{
	private String authorname;
	private int quantity;
	private String title;
	private double price;
	private Date date;
	private category category;
	public Books(String title, double price, Date date, category category, String authorname, int quantity) {
		super();
		this.title = title;
		this.price = price;
		this.date = date;
		this.category = category;
		this.authorname = authorname;
		this.quantity = quantity;
	}
	
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Books [authorname=" + authorname + ", quantity=" + quantity + ", title=" + title + ", price=" + price
				+ ", date=" + date + ", category=" + category + "]";
	}
	
	
}
