public class GMC implements Location
{
	private double lx;
	private double ly;
	
	public GMC(double x, double y)
	{
		this.lx = x;
		this.ly = y;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		lx += x;
		ly += y;
	}
	
	public double[] getLoc()
	{
		double[] loc = {lx, ly};
		return loc;
	}
}