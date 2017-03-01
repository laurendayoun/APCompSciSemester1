public class Toyota implements Location
{
	private double[] loc;
	
	public Toyota(String a)
	{
		String[] locstring = a.split(", ");
		loc = new double[2];
		this.loc[0] = Double.parseDouble(locstring[0]);
		this.loc[1] = Double.parseDouble(locstring[1]);
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