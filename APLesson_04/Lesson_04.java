import java.util.Scanner;
public class Lesson_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int one = kb.nextInt();
		System.out.println("Enter 2nd number: ");
		int two = kb.nextInt();
		
		int sum = add(one, two);
		print(one, two, sum);
		
	}
	public static int add(int one, int two)
	{
		return one + two;
	}
	public static void print(int one, int two, int sum)
	{
		System.out.println(one + " + " + two + " = " + sum);
	}
}