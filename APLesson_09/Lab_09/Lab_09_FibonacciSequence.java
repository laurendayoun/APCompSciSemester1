import java.util.Scanner;
public class Lab_09_FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int leng = kb.nextInt();
		
		int[] fibseq = new int[leng];

		System.out.println("Your Fibonacci Sequence is ");
		
		for (int i = 0; i < leng; i++)
		{
			if (i == 0 || i == 1)
			{
				fibseq[i] = start;
			}
			
			else
			{
				fibseq[i] = fibseq[i-1] + fibseq[i-2];
			}
			System.out.print(fibseq[i] + " ");
		}
		
	}
}