package day13_assignment_Q2;

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
	private category1 category;
	public Books(String title, double price, Date date, category1 category, String authorname, int quantity) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorname == null) ? 0 : authorname.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (authorname == null) {
			if (other.authorname != null)
				return false;
		} else if (!authorname.equals(other.authorname))
			return false;
		if (category != other.category)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
