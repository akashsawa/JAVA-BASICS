package S1;

public class Fruits 
{
	private String fruitname;
	public Fruits(String fruitname) 
	{
		this.fruitname = fruitname;
	}
	public String toString()
	{
		return "FRUIT: "+this.fruitname;
	}
	public void taste()
	{
		System.out.println("NO SPECIFIC TASTE ");
	}
}
