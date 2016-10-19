import java.util.Scanner;
public class Lab_04_03_Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length: ");
		double side = kb.nextDouble();
		double surfar = calcSA(side);
		print(side, surfar);
	}
	
	public static double calcSA(double side)
	{
		double sa = side*side*6;
		return sa;
	}
	
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with a side length of " + side + " is %2.5f.", sa);
	}
}