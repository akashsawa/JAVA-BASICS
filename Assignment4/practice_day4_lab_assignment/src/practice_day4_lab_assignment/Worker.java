package practice_day4_lab_assignment;

public class Worker extends Emp
{
	private int hourrate;
	private int hourswork;
    public Worker(int id, String name, int deptid, double basic,double bonus,int hourswork,int hourrate)
    {
    	super( id,name, deptid, basic);
    	this.hourswork=hourswork;
    	this.hourrate=hourrate;
    }
    public String toString()
	{
		return super.toString()+"\n HOURLY RATE:  "+this.hourrate+"\n HOURS WORKED:  "+this.hourswork+"\n NET SALARY: "+computeSalary();
	}
    public double computeSalary()
	{
		return ((hourswork*hourrate)+getBasic());
	}
}
