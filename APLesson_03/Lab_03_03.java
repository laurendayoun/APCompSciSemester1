import java.util.Scanner; // import statement

public class Lab_03_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's start by playing with numbers. Give me a number to double: ");
		int num1 = keyboard.nextInt();
		int num2 = num1*2;
		System.out.println("Your new number is " + num2 + ". Now give me a new number to add to " + num2 + ": ");
		int num3 = keyboard.nextInt();
		int num4 = num3 + num2;
		System.out.println("Your new number is " + num4 + ". Now give me a new number to multiply to " + num4 + ": ");
		int num5 = keyboard.nextInt();
		int num6 = num5*num4;
		System.out.println("Awesome! Your new number is "+ num6 + ". Give me one last number to subtract from " + num6 + ": ");
		int num7 = keyboard.nextInt();
		int num_final = num6 - num7;
		System.out.println("Cool! Your final number is " + num7 + ". Thanks for playing!");
	}
}