public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance()
	{
		super();
	}
	
	public Advance(int n)
	{
		super();
		this.daysLeft = n;
	}
	
	public int getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30;
		}
		
		else
		{
			return 40;
		}
	}
}