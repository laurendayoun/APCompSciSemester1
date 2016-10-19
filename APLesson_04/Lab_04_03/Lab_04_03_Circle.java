import java.util.Scanner;
public class Lab_04_03_Circle
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = kb.nextDouble();
		double area = calcArea(r);
		print(r, area);
	}
	
	public static double calcArea(double r)
	{
		double area = r*r*(3.14);
		return area;
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %2.5f.", area);
	}
}