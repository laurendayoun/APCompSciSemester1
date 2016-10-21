import java.util.Scanner;
public class Lab_06_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = kb.nextInt();
		System.out.println("Enter the size of the table: ");
		int a = kb.nextInt();
		System.out.println("     x | " + x + "*x");
		
		for (int i = 1; i <= a; i++)
		{
			System.out.printf("  %4d | %3d\n", i, x*i);
		}
	}
}