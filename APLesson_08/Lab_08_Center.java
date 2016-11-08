import java.util.Scanner;
public class Lab_08_Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String w1 = kb.next();
		System.out.println("Enter another word: ");
		String w2 = kb.next();
		System.out.println("Enter one more word: ");
		String w3 = kb.next();
		center(w1);
		center(w2);
		center(w3);

		
	}
	public static String center(String w)
	{
		if (w.length() < 20)
		{
			w = " " + w + " ";
			center(w);
		}
		else
		{
			System.out.println(w);
		}
		return "";
	}
}