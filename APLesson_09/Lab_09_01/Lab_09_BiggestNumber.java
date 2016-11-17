import java.util.Random;
public class Lab_09_BiggestNumber
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		
		System.out.println("For the following numbers: "); 
		printArray();
		System.out.println("\nThe biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = rand.nextInt(101);
		}
	}
	
	public static void printArray()
	{
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static int getBiggest()
	{
		int max  = 0;
		for (int a: numbers)
		{
			if (a > max)
			{
				max = a;
			}
			else
			{
				max = max;
			}
		}
		return max;
	}
}