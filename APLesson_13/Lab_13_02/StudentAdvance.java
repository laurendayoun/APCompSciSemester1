public class StudentAdvance extends Advance
{
	
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int n)
	{
		super(n);
	}
		
	public int getPrice()
	{
		
		return super.getPrice() / 2;
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
}