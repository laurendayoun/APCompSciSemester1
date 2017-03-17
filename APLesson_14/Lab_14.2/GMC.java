public class GMC extends Car
{
	private double lx;
	private double ly;
	
	public GMC(double x, double y)
	{
		this.lx = x;
		this.ly = y;
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