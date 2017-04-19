public class Car implements Location
{
	public double[] location;
	public final int ID = (int)(Math.random()*1000000) + 1;
	
	public Car()
	{
		this.location = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double a, double b)
	{
		location[0] += a;
		location[1] += b;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	
}