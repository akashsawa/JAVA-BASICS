package practice_day4_lab_assignment;

/*
 * 3.1 Emp state--- id(int), name, deptId , basic(double)
Accept all of above in constructor arguments.
Behaviour ---1.  get emp details -- override toString.
2. compute net salary ---ret 0
(eg : public double computeNetSalary(){return 0;})
 */
public abstract class Emp 
{
	private int id;
	private String name;
	private int deptid;
	private double basic;
	public Emp(int id, String name, int deptid, double basic) 
	{
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.basic = basic;
	}
	public abstract double computeSalary();
	public String toString()
	{
		return " ID: "+this.id+" NAME: "+this.name+" DEPTID: "+this.deptid+" BASIC SAL: "+getBasic();
	}
	public double getBasic() 
	{
		return basic;
	}
	public int getId()
	{
		return id;
	}
	
	
	
}
