import java.util.Scanner;

public class Lab_03_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		float height = keyboard.nextFloat();
		System.out.println("What is your weight in pounds?");
		float weight = keyboard.nextFloat();
		double BMI = (weight*0.45)/(height*height*0.025*0.025);
		System.out.println("Your BMI is " + BMI + ".");
	}
}