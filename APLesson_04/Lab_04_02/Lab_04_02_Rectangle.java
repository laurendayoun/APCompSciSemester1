import java.util.Scanner;
public class Lab_04_02_Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		l = kb.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		w = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = 2*(l+w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %7.5f feet around.", perimeter);
	}
}