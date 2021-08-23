/*2.1 Student : prn (string : unique id) , name , email , password, course (enum) ,GPA(double) , dob(Date)
Add suitable constructor/s , toString , equals (as per the requirement)
2.2 Course (enum) : DBT,REACT,ANGULAR,REST,SPRING,HIBERNATE

2.3 Create custom exception class

2.4 NO validation rules currently (keeping it simple!)

2.5 Create a Tester with following options (use dynamic data structure : ArrayList)
MUST use AL methods.
1. Add student details
2. Fetch Student details
I/P : student'd PRN
Either display details or throw custom exception , in case of invalid PRN

3. Display All student details

4. Cancel Admission
I/P : student'd PRN
Either remove student  details or throw custom exception , in case of invalid PRN

5. Update GPA
I/P : student'd PRN n new GPA
Either update student  details or throw custom exception , in case of invalid PRN
 * 
 * 
 * 
 */


package tester;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Consumer;

import Studentclass.Coursetype;
import Studentclass.Customer;
import Studentclass.CustomerComparator;

import static tester.collectionUtils.*;
import static utils.ValidationUtils.*;

public class Test1 {
	//private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in)) 
		{
			//System.out.println("ENTER NUMBER OF CUSTOMERS: ");
			int ch;
			
			ArrayList<Customer>studentList=populateSampleData();
			while((ch=menuList())!=0)
			{
				
				try
				{
					switch(ch)
					{
						case 1:
							System.out.println("ENTER STUDENT DETAILS: PRN,NAME, EMAIL,PASSWORD, GPA,DATE OF BIRTH, COURSE TYPE");
							Customer newCustomer=new Customer(correctPNR(sc.next(),studentList),sc.next(), correctemail(sc.next(),studentList), checkByPassword(sc.next()), checkByGPA(sc.nextDouble())
									,validDate(sc.next()) , validCustomer(sc.next()));
							studentList.add(newCustomer);
							
							break;
						case 2:
							System.out.println("CUSTOMER DETAILS: ");
							System.out.println("*******************************");
							for(Customer c:studentList)
							{
								System.out.println(c.toString());
							}
							break;
						case 3:
							System.out.println("ENTER PRN: ");
							String newpnr=sc.next();
							Customer checkno=new Customer(newpnr);
							int index=studentList.indexOf(checkno);
							if(index!=-1)
							{
								System.out.println("ENTER NEW GPA: ");
								int newgpa = sc.nextInt();
								Customer temp = studentList.get(index);
								temp.setGpa(newgpa);							
								System.out.println("UPDATED ");
							}
							else
								System.out.println("CUSTOMER NOT FOUND !!!");
								//System.out.println("USER FOUND !");
//							if(searchEmail(str,customerList))
//							{
//								System.out.println("ACCOUNT PRESENT !");
//								System.out.println("ENTER NEW PASSWORD");
//								String pass=sc.next();
//								
//							}
							break;
						case 4:
							System.out.println("ENTER PRN: ");
							String regno=sc.next();
							Customer checkprn=new Customer(regno);
							int index1=studentList.indexOf(checkprn);
							System.out.println(studentList.get(index1));
							break;
						case 5:
							removeStudent(studentList);
							break;
						case 6:
							System.out.println("ENTER DATE: ");
							Date date=validDate(sc.next());
							System.out.println("ENTER COURSE NAME: ");
							String coursename=sc.next();
							for(Customer cust:studentList)
							{
								if(cust.getDob().before(date) && cust.getCourse()==validCustomer(coursename))
									System.out.println("NAME: "+cust.getName()+" DOB: "+cust.getDob()+" COURSE NAME ENROLLED: "+cust.getCourse());
							} 
							break;
						case 7:
							Collections.sort(studentList);
							break;
						case 8:
							//Collections.sort(studentList,new CustomerComparator()); //OR USING ANONYMOUS INNER CLASS
							Collections.sort(studentList,new Comparator<Customer>() // CREATING INSTANCE of class WHO has implemented comparator interface
							{
								public int compare(Customer c1,Customer c2)
								{
									return ((Double)c1.getGpa()).compareTo(c2.getGpa());
//									if(c1.getGpa()<c2.getGpa())
//										return -1;
//									if(c1.getGpa()>c2.getGpa())
//										return 1;
//									return 0;
								}
							});
							break;
						case 9:
							Collections.sort(studentList,new Comparator<Customer>() // CREATING INSTANCE WHOSE
									{
										public int compare(Customer c1,Customer c2)
										{
										
											 int ret=c1.getCourse().compareTo(c2.getCourse());
											 if(ret==0)
											 {
												 if(c1.getGpa()<c2.getGpa())
														return -1;
													if(c1.getGpa()>c2.getGpa())
														return 1;
												return 0;

											 }
											 return ret;
										}
									});
							break;
						case 10:
							ArrayList<Integer>newcount=new ArrayList<Integer>();
							for(Customer s:studentList)
							{
								if(s.getGpa()<5)
								{
									int in=studentList.indexOf(s);
										newcount.add(in);
								}
							}
							for(Integer q:newcount)
								studentList.remove((int)q);
				
							break;
						case 11:
						
							
					}
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}

			}
							
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	private static int menuList()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ADD DETAILS: ");
		System.out.println("2. DISPLAY ALL DETAILS: ");
		System.out.println("3. UPDATE GPA");
		System.out.println("4. DISPLAY STUDENT DETAILS:");
		System.out.println("5. REMOVE STUDENT");
		System.out.println("6. FIND STUDENTS ENROLLED BEFORE SPECIFIC DATE:");
		System.out.println("7. SORT ACCORDING TO PRN NO. USING NATURAL SORTING");
		System.out.println("8. SORT ACCORDING TO GPA:");
		System.out.println("9. SORT ACCORDING TO COURSE TYPES");
		System.out.println("10. REMOVE STUDENTS BELOW 5 GPA");
		System.out.println("11. REVERSE ");
		System.out.println("0. EXIT");
		return sc.nextInt();
		
		
	}
	

}
