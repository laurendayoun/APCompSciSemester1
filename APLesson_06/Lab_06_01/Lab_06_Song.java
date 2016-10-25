public class Lab_06_Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int num)
	{
		String a = "";
		for (int i = 1; i <= num; i++)
		{
			a = a + " " + word;
		}
		System.out.println(a);
	}
}