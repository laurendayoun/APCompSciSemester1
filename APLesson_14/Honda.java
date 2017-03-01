public class Honda implements Location
{
	public double[] loc;
	
	public Honda(double[] x)
	{
		this.loc = x;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}