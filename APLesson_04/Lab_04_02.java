import java.util.Scanner;

public class Lab_04_02
{
	public static void main(String[]args)
	{
		Lab_04_02 self = new Lab_04_02();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstname = kb.next();
		System.out.println("Enter your last name:");
		String lastname = kb.next();
		System.out.println("Enter your title:");
		String title = kb.next();
		String throwaway3 = kb.nextLine();
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.next();
		String throwaway2 = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("***************************************");
		self.IDCard(firstname, lastname, title, school, year, subject);
		System.out.println("\n***************************************");
		
	}
	public void IDCard(String firstname, String lastname, String title, String school, String year, String subject)
	{
		System.out.printf("* %15s \t%15s  *", school, year);
		System.out.printf("\n* %15s \t%15s  *", firstname, lastname);
		System.out.printf("\n* %15s \t%15s  *", title, subject);
	}
}