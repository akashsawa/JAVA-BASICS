//Create a class TestVehicle under the package "tester"
//Accept details of 2 vehicles from user . 
//Display "SAME" or "DIFFERENT" , using inherited "equals" method , from Object class.
//Observe & conclude
//Is there any problem ?
//If yes : think of the solution.

package tester;
import java.util.Scanner;
import com.app.vehicles.*;
public class TestVehicle 
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
			Object veh2=new Vehicle(null,null,0);
			System.out.println("ENTER DETAILS OF VEHICLE1: ");
			TestVehicle.accept(veh1);
			System.out.println("ENTER DETAILS OF VEHICLE2: ");
			TestVehicle.accept(veh2);
			System.out.println("REFERENCE CHECKING USING EQUALS METHOD: "+veh1.equals(veh2));
			//System.out.println("REFERENCE CHECKING USING ELEMENT MATCHING: "+veh1.getRegno().equals(veh2.getRegno()));
			String s="hello";
			System.out.println(veh1.equals(s));
		}
	}
	
}
