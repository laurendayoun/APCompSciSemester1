import java.util.Scanner;
public class Lab_08_TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String a = kb.next();
		int stop = a.length();
		tree(a, 0, stop);
	}
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%10s \n", word.substring(0, start));
			start++;
			tree(word, start, stop);
		}
		else
		{
			return "";
		}
		return "";
	}
}