import java.util.Scanner;
public class Lab_05_01_BMI
{
	static double w;
	static double h;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your weight in pounds? ");
		w = kb.nextDouble();
		System.out.println("What is your height in inches? ");
		h = kb.nextDouble();
		calcBMI();
		System.out.printf("Your BMI is: %3.3f", bmi);
		System.out.println("\nYou are " + condition);
	}
	
	public static void calcBMI()
	{
		bmi = (w*0.45)/(h*h*0.025*0.025);
		if (bmi <= 18.5)
		{
			condition = "Underweight";
		}
		else if (bmi <= 24.9)
		{
			condition = "Normal";
		}
		else if (bmi <= 29.9)
		{
			condition = "Overweight";
		}
		else if (bmi <= 34.9)
		{
			condition = "Obese";
		}
		else if (bmi <= 39.9)
		{
			condition = "Very Obese";
		}
		else
		{
			condition = "Morbidly Obese";
		}
	}

}