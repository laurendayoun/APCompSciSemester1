import java.util.Scanner;
public class Lab_09_AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers: ");
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = kb.nextInt();
		}
		
		System.out.println("Numbers: ");
		
		for (int num: numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("The average of the above numbers is " + average(numbers) + ".");
	}
	
	public static double average(int[] a)
	{
		int sum = 0;
		double i = 0;
		for (int b: a)
		{
			sum = sum + b;
			i++;
		}
		double average = sum / i;
		return average;
	}
}