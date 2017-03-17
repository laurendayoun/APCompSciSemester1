public class Honda extends Car
{
	public double[] loc;
	
	public Honda(double[] x)
	{
		this.loc = x;
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