package tester;
import java.util.Scanner;

import S1.Apple;
import S1.Fruits;
import S1.Mango;
import S1.Orange;
import S1.Fruits;
public class test {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch;
		System.out.println("ENTER CAPACITY: ");
	    Fruits fruit[]=new Fruits[sc.nextInt()];
	    int counter=0;
	    System.out.println("ENTER CHOICE: ");
	    while((ch=menuList())!=0)
	    {
	    	switch (ch)
	    	{
	    		case 1: 
	    			  if(counter<fruit.length) 
	    			  {
	    			    	fruit[counter++]=new Apple();  //UPCAST
	    			  }
	    			  else
	    				  System.out.println("LIST FULL");
	    			  break;
	    		case 2: 
	    			  if(counter<fruit.length) 
	    			  {
	    			    	fruit[counter++]=new Orange();  //UPCAST
	    			  }
	    			  else
	    				  System.out.println("LIST FULL");
	    			  break;
	    		case 3: 
	    			  if(counter<fruit.length) 
	    			  {
	    			    	fruit[counter++]=new Mango();  //UPCAST
	    			  }
	    			  else
	    				  System.out.println("LIST FULL");
	    			  break;
	    		case 4: 
	    			  for(Fruits fruit1:fruit)
	    			  {
	    				   if(fruit1 !=null)
	    				   {
	    			           System.out.println(fruit1.toString()); //RUNTIME POLYMORPHISM
	    			           fruit1.taste();  //RUNTIME PLOYMORPHISM
	    				   }
	    			  }
	    			  break;
	    		default: System.out.println("INVALID CHOICE !");
	    		         break;
	    	}
	    }

	}

	private static int menuList()
	{
		System.out.println("1.ADD APPLE");
		System.out.println("2.ADD ORANGE");
		System.out.println("3.ADD MANGO");
		System.out.println("4.DISPLAY ALL ");
		System.out.println("0.EXIT ! ");
		return sc.nextInt();
	}
}
