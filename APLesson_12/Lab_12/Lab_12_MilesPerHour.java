import java.lang.Math;
public class Lab_12_MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public Lab_12_MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public Lab_12_MilesPerHour(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public double getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}