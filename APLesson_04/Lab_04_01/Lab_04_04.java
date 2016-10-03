import java.util.Scanner;

public class Lab_04_04
{
	public static void main(String[]args)
	{
		Lab_04_04 self = new Lab_04_04();
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("What is the height? ");
		double h = kb.nextDouble();
		System.out.println("What is the length? ");
		double l = kb.nextDouble();
		System.out.println("What is the width? ");
		double w = kb.nextDouble();
		
		//method call
		System.out.printf("The volume of your box is %3.2f cubic feet", self.calcvol(h,w,l));
		
	}
	public double calcvol(double h, double w, double l)
	{
		return l*w*h/(Math.pow(12,3));
	}
}