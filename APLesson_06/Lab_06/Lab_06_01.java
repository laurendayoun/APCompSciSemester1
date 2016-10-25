import java.util.Scanner;
public class Lab_06_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = kb.next();
		int a = input.length();
		
		for (int i = 1; i <= a; i++)
		{
			System.out.print(input + " ");
		}
	}
}