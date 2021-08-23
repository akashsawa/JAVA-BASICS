package tester;
import java.util.Scanner;

import practice_day4_lab_assignment.Emp;
import practice_day4_lab_assignment.Mgr;
import practice_day4_lab_assignment.Worker;
public class test {
	private static Scanner sc=new Scanner(System.in);
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
				    for(Emp emp:employee)
				    {
				    	if(emp!=null)
				    		System.out.println(emp);
				    }
					break;
			}
		}

	}
	private static int menuList()
	{
		System.out.println("1. HIRE MANAGER");
		System.out.println("2. HIRE WORKER");
		System.out.println("3. DISPLAY");
		return sc.nextInt();
	}

}
