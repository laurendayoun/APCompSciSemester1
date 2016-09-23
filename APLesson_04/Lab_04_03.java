import java.util.Scanner;

public class Lab_04_03
{
	public static void main(String[]args)
	{
		Lab_04_03 totalcost = new Lab_04_03();
		Scanner kb = new Scanner(System.in);
		
		//user inputs
		System.out.println("What is the principal amount? ");
		double p = kb.nextDouble();
		System.out.println("What is the interest rate in %? ");
		double r1 = kb.nextDouble();
		double r = r1/100;
		System.out.println("What is the number of times the loan is compounded per year? ");
		int n = kb.nextInt();
		System.out.println("What is the life of the loan in years? ");
		double y = kb.nextDouble();
		
		//method call
		double total = totalcost.interest(r,p,n,y);
		System.out.printf("Your yearly payment is $%8.2f", total);
		
		//method call 2
		double monthly = totalcost.monthlyinterest(r,p,n,y);
		System.out.printf("\nYour monthly payment is $%7.2f", monthly);
	}
	public double interest(double r, double p, int n, double y)
	{
		return (p*Math.pow((1.0+(r/n)),(y*n)));
	}
	public double monthlyinterest(double r, double p, int n, double y)
	{
		return (p*Math.pow((1.0+(r/n)),(y*n))/(12*y));
	}
}