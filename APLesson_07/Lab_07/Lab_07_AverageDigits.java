import java.util.Scanner;
public class Lab_07_AverageDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numoriginal = kb.nextInt();
		int num = numoriginal;
		int sum = 0;
		double digits = 0;
		
		while (num > 0)
		{
			sum += num%10;
			num = num/10;
			digits++;
		}
		
		double average = sum/digits;
		
		System.out.printf("The average of the digits in " + numoriginal + " is %1.2f.", average);
	}
}