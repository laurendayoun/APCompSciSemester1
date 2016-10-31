import java.util.Scanner;
public class Lab_07_ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numoriginal = kb.nextInt();
		int num = numoriginal;
		int rev = 0;
		
		while (num > 0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println(numoriginal + " reversed is " + rev + ".");
	}
}