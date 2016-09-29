import java.util.Scanner;
public class Lab_04_08_Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static double calcArea()
	{
		area = r*r*(3.14);
		return area;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %2.5f.", calcArea());
	}
}