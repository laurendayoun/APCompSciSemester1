import java.util.Scanner;
public class Lab_08_Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = kb.nextLine();
		replace(sentence);
		
	}
	public static String replace(String s)
	{
		if (s.indexOf(" ") == -1)
		{
			System.out.println(s);
			return s;
		}
		else
		{
			int a = s.indexOf(" ");
			String b = s.substring(0,a) + "_" + s.substring(a+1);
			replace(b);
		}
		return "";
	}
}