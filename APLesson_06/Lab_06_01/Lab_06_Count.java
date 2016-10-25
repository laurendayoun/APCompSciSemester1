import java.util.Scanner;
public class Lab_06_Count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you want to count to? ");
		int a = kb.nextInt();
		System.out.println("What do you want to count by? ");
		int b = kb.nextInt();
		
		for (int i = b; i <=a; i+=b)
		{
			System.out.print(i + "\t");
		}
	}
}