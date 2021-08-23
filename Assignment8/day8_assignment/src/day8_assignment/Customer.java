package day8_assignment;

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
public class Customer 
{
	private String name;
	private String email;
	private String password;
	private double registeramount;
	private Date dob;
	private Customertype customer;
	public static SimpleDateFormat sdf=null;
	static
	{
		sdf=new SimpleDateFormat("dd-mm-yyyy");
	}
	public Customer(String name, String email, String password, double registeramount, Date dob, Customertype customer) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registeramount = registeramount;
		this.dob = dob;
		this.customer = customer;
	}
	@Override
	public String toString() 
	{
		return "Customer [name=" + this.name + ", email=" + this.email + ", password=" + this.password + ", registeramount="
				+ this.registeramount + ", dob=" + sdf.format(this.dob) + ", customer=" + this.customer + "]";
	}
	public boolean equals(Object c)
	{
		if(c instanceof Customer)
		{
			Customer newc=(Customer)c;
			return this.email.equals(newc.email);
		}
		return false;
	}
	public Customer(String email) 
	{
		super();
		this.email = email;
	}
	
}
