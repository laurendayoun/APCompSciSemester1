import java.util.Scanner;
public class Lab_09_FindtheZs
{
	static String[] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		
		System.out.println("For the words: "); 
		printArray();
		
		if ((getZs()).equals(" "))
		{
			System.out.println("\nNone of the words have the letter Z.");
		}
		else
		{
			System.out.println("\nOnly" + getZs() + "contain(s) the letter z");
		}
		
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words: ");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for (String a: words)
		{
			System.out.print(a + " ");
		}
	}
	
	public static String getZs()
	{
		String zs = " ";
		for (String a: words)
		{
			if (a.indexOf("Z") >= 0)
			{
				zs = zs + a + " ";
			}
			else
			{
				zs = zs;
			}
		}
		return zs;
	}
}