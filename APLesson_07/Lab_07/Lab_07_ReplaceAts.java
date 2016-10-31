import java.util.Scanner;
public class Lab_07_ReplaceAts
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = kb.nextLine();
		String newsentence = "";
		int top = 0;
		
		while (top < sentence.length())
		{
			Character ab = sentence.charAt(top);
			String a = ab.toString();
			if (a.equals("a"))
			{
				newsentence = newsentence + "@";
				top++;
			}
			else
			{
				newsentence = newsentence + a;
				top++;
			}
		}
		
		System.out.println(newsentence);
	}
}