import java.util.Scanner;
public class Lab_04_03_Average
{
	public static void main(String[]args)
	{
		Lab_04_03_Average self = new Lab_04_03_Average();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = kb.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = kb.nextDouble();
		System.out.println("Enter the third number: ");
		double num3 = kb.nextDouble();
		double av = calcaverage(num1, num2, num3);
		print(num1, num2, num3, av);
	}
	
	public static double calcaverage(double num1, double num2, double num3)
	{
		double average = (num1+num2+num3)/3;
		return average;
	}
	
	public static void print(double num1, double num2, double num3, double a)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + " and " + num3 + " is %2.5f.", a);
	}
}