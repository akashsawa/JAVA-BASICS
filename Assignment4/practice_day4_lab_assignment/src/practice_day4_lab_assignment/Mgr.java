package practice_day4_lab_assignment;

public class Mgr extends Emp 
{
	private double perfbonus;
    public Mgr(int id, String name, int deptid, double basic,double bonus)
    {
    	super( id,name, deptid, basic);
    	this.perfbonus=bonus;
    }
    public String toString()
	{
		return super.toString()+"\n PERFORMANCE BONUS "+this.perfbonus+"\n NET SALARY: "+computeSalary();
	}
    public double computeSalary()
	{
		return (perfbonus+getBasic());
	}
    public double getPerfbonus()
    {
		return perfbonus;
    }
}
