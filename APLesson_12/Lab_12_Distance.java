import java.lang.Math;
public class Lab_12_Distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public Lab_12_Distance()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		distance = 0;
	}
	
	public Lab_12_Distance(int a, int b, int c, int d)
	{
		x1 = a;
		x2= c;
		y1 = b;
		y2 = d;
		distance = 0;
	}
	
	public void setValues(int a, int b, int c, int d)
	{
		x1 = a;
		x2 = c;
		y1 = b;
		y2 = d;
	}
	
	public int getx1()
	{
		return x1;
	}
	
	public int getx2()
	{
		return x2;
	}
	
	public int gety1()
	{
		return y1;
	}
	
	public int gety2()
	{
		return y2;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
	
}