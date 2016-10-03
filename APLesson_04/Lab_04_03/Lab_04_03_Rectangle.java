import java.util.Scanner;
public class Lab_04_03_Rectangle
{	
	public static void main(String[]args)
	{
		Lab_04_03_Rectangle self = new Lab_04_03_Rectangle();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		double l = kb.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double w = kb.nextDouble();
		double perim = calcPerim(l,w);
		print(perim);
	}
	
	public static double calcPerim(double l, double w)
	{
		double perimeter = 2*(l+w);
		return perimeter;
	}
	
	public static void print(double a)
	{
		System.out.printf("Your rectangle is %7.5f feet around.", a);
	}
}