//Create a class TestVehicle under the package "tester"
//Accept details of 2 vehicles from user . 
//Display "SAME" or "DIFFERENT" , using inherited "equals" method , from Object class.
//Observe & conclude
//Is there any problem ?
//If yes : think of the solution.

package tester;
import java.util.Scanner;
import com.app.vehicles.*;
public class Test1 
{
	private static Scanner sc=new Scanner(System.in);
	public static void accept(Object veh1)
	{
		System.out.println("ENTER REG NO. ");
		((Vehicle) veh1).setRegno(sc.next());
		System.out.println("ENTER COLOR: ");
		((Vehicle) veh1).setColor(sc.next());
		System.out.println("ENTER PRICE: ");
		((Vehicle) veh1).setPrice(sc.nextDouble());
		
	}
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Object veh1=new Vehicle(null, null, 0);
			//Object veh2=new Vehicle(null,null,0);
			System.out.println("ENTER DETAILS OF VEHICLE1: ");
			Test1.accept(veh1);
			
		}
	}
	
}
