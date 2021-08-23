
/*
2. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/



package src;
import java.util.Scanner;

public class Program
{
	private static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		//System.out.println("ENTER :");
		System.out.println("1. TEA : (RS.10)");
		System.out.println("2. GREEN TEA : (RS.15)");
		System.out.println("3. SAMOSA : (RS.20)");
		System.out.println("4. SANDWITCH : (RS.50)");
		System.out.println("5. GENERATE BILL & EXIT: ");
		System.out.println("ENTER CHOICE: ");
		return sc.nextInt();
	}
	
	public static void main(String args [])
	{
		
		int ch,q,m,t = 0,k=0,b=0,g = 0;
		String res = null;
		String res1 = null;
		String res2 = null;
		String res3 = null;
		Bill bill=new Bill();
		while((ch = menuList())!=5)
		{
			int n;
			int o;
			switch (ch)
			{
				
				case 1: System.out.println("ENTER QUANTITY: ");
						q=sc.nextInt();
						bill.setQuantity(q);
						bill.setPrice(10);
						res=bill.calculate(q,10);
						t=bill.total();
					    break;
			
				case 2: System.out.println("ENTER QUANTITY: ");
						m=sc.nextInt();
						bill.setQuantity(m);
						bill.setPrice(15);
						res1=bill.calculate(m,15);
						k=bill.total();
					    break;
					    
				case 3: System.out.println("ENTER QUANTITY: ");
						n=sc.nextInt();
						bill.setQuantity(n);
						bill.setPrice(15);
						res2 = bill.calculate(n,20);
						g = bill.total();
						break;
			    
				case 4: System.out.println("ENTER QUANTITY: ");
						o=sc.nextInt();
						bill.setQuantity(o);
						bill.setPrice(15);
						res3 = bill.calculate(o,50);
						b = bill.total();
						break;
			    default:System.out.println("INVALID NO.");
			    		break;
			}
		}
		//System.out.println(res.toString());
		System.out.println("****BILL****");
		if(res==null)
			System.out.print("");
		else
			System.out.println(res.toString());
		if(res1==null)
			System.out.print("");
		else
			System.out.println(res1.toString());
		if(res2==null)
			System.out.print("");
		else
			System.out.println(res2.toString());
		if(res3==null)
			System.out.print("");
		else
			System.out.println(res3.toString());

		System.out.println("-------------");
		System.out.println("TOTAL:"+ (t+k+b+g));
		
			
	}
}

class Bill
{
	private int price;
	private int quantity;
	Bill()
	{
		this(0,0);
	}
	Bill(int price, int quantity) 
	{
		this.price = price;
		this.quantity = quantity;
	}
		
	public void display(int res) 
	{
		System.out.println("****BILL****");
		System.out.println("TEA: "+this.quantity + "  "+this.price);
		System.out.println("TOTAL - " +res);
		
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
	public String calculate(int quantity, int p) 
	{
		
		switch(p)
		{
			case 10:	return("TEA: "+this.quantity + "  "+this.price) ;	
											
			case 15:	return("GREEN TEA: "+this.quantity + "  "+this.price) ;
						
			case 20:	return("SAMOSA: "+this.quantity + "  "+this.price) ;

			case 50:	return("SANDWITCH: "+this.quantity + "  "+this.price) ;
       	
		}
		return null;
	}
	
	public int total()
	{
		return getPrice() * this.quantity;
	
	}
}

