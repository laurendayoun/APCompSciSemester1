import java.util.Scanner;
public class Lab_09_ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Enter 5 words: ");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In order: ");
		
		for (String word: words)
		{
			System.out.print(word + " ");
		}
		
		System.out.println("\nReversed: ");
		reverse(words);
	}
	
	public static void reverse(String[] a)
	{
		for (int i = a.length - 1; i >= 0; i--)
		{
			System.out.print(a[i] + " ");
		}
	}
}