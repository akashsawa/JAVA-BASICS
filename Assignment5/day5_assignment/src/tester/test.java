package tester;
import java.util.Scanner;

import practice_day4_lab_assignment.Emp;
import practice_day4_lab_assignment.Mgr;
import practice_day4_lab_assignment.Worker;
public class test {
	private static Scanner sc=new Scanner(System.in);
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		int ch;
		System.out.println("ENTER TOTAL NO. OF EMPLOYEES : ");
		Emp employee[]=new Emp[sc.nextInt()];
		int counter=0;
		while((ch=menuList())!=0)
		{
			switch(ch)
			{
				case 1:
					    if(counter<employee.length)
					    {
					    	System.out.println("int,str,int,double,double");
					    	employee[counter++]=new Mgr(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
					    }
					    else
					    	System.out.println("FULL");
						break;
				case 2:
				    if(counter<employee.length)
				    {
				    	System.out.println("int,str,int,double,double,int,int");
				    	employee[counter++]=new Worker(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
				    }
				    else
				    	System.out.println("FULL");
					break;
				case 3:
					Emp []emp=employee;
				    for(Emp ele:emp)
				    {
				    	if(ele!=null)
				    	{
				    		if(ele instanceof Mgr)
				    		{
				    			System.out.println(ele+" PERFORMANCE BONUS: "+((Mgr) ele).getPerfbonus()+"\n");
				    		}
				    		else if(ele instanceof Worker)
				    		{
				    			System.out.println(ele+" HOURLY RATE: "+((Worker) ele).getHourrate()+"\n");
				    		}
				    		else
				    			System.out.println("INVALID DATA !");
				    		
				    	}
				    }
					break;
				case 4:
						Emp []emp1=employee;
						System.out.println("ENTER EMPID");
						Integer empid=sc.nextInt();
						for(Emp newemp:emp1)
						{
							if(newemp instanceof Mgr && newemp.getId()==empid )
							{
								System.out.println("ENTER PERFORMANCE BONUS: ");
								((Mgr)newemp).setPerfbonus(sc.nextDouble());
							}
							else if(newemp instanceof Worker && newemp.getId()==empid )
							{
								System.out.println("ENTER HOURLY RATE: ");
								((Worker)newemp).setHourrate(sc.nextInt());
							}
						}
						break;
				default: System.out.println("INVALID INPUT !");
			}
		}

	}
	private static int menuList()
	{
		System.out.println("1. HIRE MANAGER");
		System.out.println("2. HIRE WORKER");
		System.out.println("3. DISPLAY");
		System.out.println("4. MODIFY DETAILS");
		System.out.println("0. EXIT");
		return sc.nextInt();
	}
	
}
