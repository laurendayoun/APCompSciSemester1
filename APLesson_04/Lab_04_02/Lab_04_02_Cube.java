import java.util.Scanner;
public class Lab_04_02_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length: ");
		side = kb.nextDouble();
		calcSA();
		print();
	}
	
	public static void calcSA()
	{
		sa = side*side*6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with a side length of " + side + " is %2.5f.", sa);
	}
}