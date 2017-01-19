import java.util.Scanner;
public class UserRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String fn = kb.next();
		System.out.println("What is your last name?");
		String ln = kb.next();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String answer = kb.next();
		
		if (answer.equals("y"))
		{
			System.out.println("What is your avatar?");
			String av = kb.next();
			
			User ph = new User(fn, ln, av);
			System.out.println(ph);
		}
		else
		{
			User ph = new User(fn, ln);
			System.out.println(ph);
		}
	}
}