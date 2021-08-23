package Studentclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 1. import day8.1 & day8.2  to revise StringBuilder , var-args , Date / Time Handling , enums
(Refer to individual readmes)

2. Weekend assignment
Create Java application for customer management system.

2.1 Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),type (CustomerType : enum)
CustomerType : SILVER,GOLD,PLATINUM
Add/generate suitable constructor & toString
Unique ID(Primary Key ) : email  (2 customers are SAME iff their email ids are same)
Will you add any other data member in Customer class for parsing n formatting dates ? 
HOW ? : 


2.2 Create custom exception (checked exception )class in a separate package
CustomerHandlingException

2.3 Create in "utils" package : ValidationRules
Rules 
email must contain "@" & should be from ".com" domain
password must be min 4 max 10 chars long
reg amount should be multiples of 500
dob should be before 1st Jan 1995
duplicate customer details should not be stored.

Supply these validation rules using different static methods.
(Centralized exception handling is expected)

2.4 Create a simple tester : Tester1 
MUST use try-with-resources to create scanner.
Options
1. Prompt for customer details
Validate customer details (using validation rules)
You should not  accept duplicate customer details
Iff it's valid , create customer instance , o.w display error message via catch clause.

2. Display details of all registered customers
(for-each)

3. Exit

 */

public class Customer implements Comparable<Customer>
{
	private String name;
	private String email;
	private String password;
	private Date dob;
	private String prn;
	private double gpa;
	private Coursetype course;
	public static SimpleDateFormat sdf=null;
	static
	{
		sdf=new SimpleDateFormat("dd-mm-yyyy");
	}
	public Customer(String prn,String name, String email, String password, double gpa, Date dob, Coursetype course) 
	{
		super();
		this.prn=prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gpa = gpa;
		this.dob = dob;
		this.course = course;
	}
	@Override
	
	public boolean equals(Object c)
	{
		if(c instanceof Customer)
		{
			Customer newc=(Customer)c;
			return this.prn.equals(newc.prn);
		}
		return false;
	}
	public Coursetype getCourse() {
		return course;
	}
	public void setCourse(Coursetype course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob + ", prn="
				+ prn + ", gpa=" + gpa + ", course=" + course + "]";
	}
	public Customer(String prn) 
	{
		super();
		this.prn = prn;
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Date getDob() {
		return dob;
	}
	
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	
	public double getGpa() {
		return gpa;
	}
	public int compareTo(Customer cust)
	{
		return this.getPrn().compareTo(cust.getPrn());
	}
	
}
