import java.util.Scanner;
public class Lab_05_01_GPACalc
{
	static String grade;
	static double gradetotal;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		gradetotal = 0.0;
		System.out.println("What is your Science grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your Math grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your English grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your History grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your Art grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your Computer Science grade? ");
		grade = kb.next();
		calcPoints(grade);
		System.out.println("What is your Spanish grade? ");
		grade = kb.next();
		calcPoints(grade);
		double gpa = gradetotal/7.0;
		System.out.printf("Your total GPA is %3.2f.", gpa);
	}
	
	public static void calcPoints(String gradem)
	{
		if (gradem.equals("A"))
		{
			gradetotal = gradetotal + 4.0;
		}
		if (gradem.equals("B"))
		{
			gradetotal = gradetotal + 3.0;
		}
		if (gradem.equals("C"))
		{
			gradetotal = gradetotal + 2.0;
		}
		if (gradem.equals("D"))
		{
			gradetotal = gradetotal + 1.0;
		}
		if (gradem.equals("F"))
		{
			gradetotal = gradetotal;
		}
	}

}