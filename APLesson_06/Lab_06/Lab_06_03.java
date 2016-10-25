import java.util.Scanner;
public class Lab_06_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = kb.next();
		int a = input.length();
		
		for (int i = a; 0 < i; i--)
		{
			input = input.substring(0, i);
			System.out.println(input);
		}
	}
}