import java.util.Scanner;

public class Lab_03_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in meters?");
		float height = keyboard.nextFloat();
		System.out.println("What is your weight in kilograms?");
		float weight = keyboard.nextFloat();
		float BMI = weight/(height*height);
		System.out.println("Your BMI is " + BMI + ".");
	}
}