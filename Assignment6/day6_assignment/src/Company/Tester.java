package Company;
import java.util.Scanner;
import static Company.Stack.size;
public class Tester {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
//		Stack stk=new FixedSizeStack();
//		stk.push(new Employee(sc.nextInt(),sc.next()));
//		stk.push(new Employee(sc.nextInt(),sc.next()));
//		stk.push(new Employee(sc.nextInt(),sc.next()));
//		Employee emp=stk.pop();
//		System.out.println(emp);
		int ch,opt1,opt2;
		int counter=0;
		while((ch=menuList())!=0)
		{
			switch(ch)
			{
				case 1: Stack stk1=new FixedSizeStack();
						while((opt1=newmenu())!=0)
						{
							switch(opt1)
							{
								case 1:
										if(opt1==1)
										{
											System.out.println("ENTER EMPLOYEE & ID NAME: ");
											stk1.push(new Employee(sc.nextInt(),sc.next()));	
										}
										break;
								case 2:
									System.out.println(stk1.pop()+" IS DELETED !");
							}
							
						}
						break;
				case 2: Stack stk2=new GrowableStack();
						while((opt2=newmenu())!=0)
						{
							switch(opt2)
							{
								case 1:
										if(opt2==1)
										{
											System.out.println("ENTER EMPLOYEE & ID NAME: ");
											stk2.push(new Employee(sc.nextInt(),sc.next()));
										}
										break;
								case 2:
										System.out.println(stk2.pop()+" IS DELETED !");
							}
					
						}
						break;
				default: System.out.println("INVALID CHOICE !");
			}		
			
		}
		
	}
	private static int menuList()
	{
		System.out.println("1. FIXED STACK");
		System.out.println("2  GROWABLE STACK");
		
		return sc.nextInt();
	}
	private static int newmenu()
	{
		System.out.println("1. PUSH");
		System.out.println("2. POP");
	
		return sc.nextInt();
	}
	
}
