import java.util.Scanner;
public class Lab_06_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = kb.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= a; i++)
		{
			factorial = factorial*i;
		}
		
		System.out.println("The factorial of " + a + " is " + factorial + ".");
	}
}