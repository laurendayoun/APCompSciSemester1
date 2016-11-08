import java.util.Scanner;
public class Lab_08_Lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();
		System.out.println("The number of 7s in " + num + " is " + luck(num) + ".");
		
	}
	public static int luck(int n)
	{
		if (n > 0)
		{
			if (n%10 == 7)
			{
				return 1 + luck(n/10);
			}
			else
			{
				return 0 + luck(n/10);
			}
		}
		else
		{
			return 0;
		}
	}
}