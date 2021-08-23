package Company;
public class GrowableStack implements Stack
{
	private int top=-1;
	private Employee [] emp;
	public GrowableStack()
	{
		super();
		this.emp = new Employee[size];
	}
	public void push(Employee ele)
	{
		int i;
		if(this.top==this.emp.length-1)
		{
			Employee newemp[]=new Employee[emp.length*2];
			for(i=0;i<emp.length;i++)
			{
				newemp[i]=emp[i];
			}
			emp=newemp;
		}
		emp[++top]=ele;
	}
	public Employee pop()
	{
		if(this.top==-1)
		{
			System.out.println("STACK IS EMPTY !");
			return null;
		}
		return this.emp[top--];
	}
}




