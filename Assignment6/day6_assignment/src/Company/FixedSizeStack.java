package Company;


public class FixedSizeStack implements Stack{
	
	private Employee[] empnew;
	private int top = -1;
	
	public FixedSizeStack()
	{
		empnew = new Employee[size];
	}

	public FixedSizeStack(int size) 
	{
		empnew = new Employee[size];
	}

	@Override
	public void push(Employee e) 
	{
		if(this.top == this.empnew.length-1 )
		{
			System.out.println("Stack is full!");
			return;
		}
		empnew[++top] = e;
	}

	@Override
	public Employee pop() 
	{
		if(top == -1) 
		{
			System.out.println("Stack is Empty.");
			return null;
		}
		
		return empnew[top--];
	}

}
