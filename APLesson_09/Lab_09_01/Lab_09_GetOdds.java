import java.util.Random;
public class Lab_09_GetOdds
{
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		
		System.out.println("For the following numbers: "); 
		printArray();
		System.out.println("\nThere are " + getOdds() + " odd numbers");
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
	
	public static int getOdds()
	{
		int odds  = 0;
		for (int a: numbers)
		{
			if (a%2 == 0)
			{
				odds++;
			}
			else
			{
				odds = odds;
			}
		}
		return odds;
	}
}