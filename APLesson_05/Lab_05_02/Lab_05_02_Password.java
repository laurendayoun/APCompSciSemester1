import java.util.Scanner;
public class Lab_05_02_Password
{
	static String username;
	static String password;
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = "abcd";
		password = "zyx10";
		
		recursion();
	}
	public static void recursion()
	{
		System.out.println("What is your username? ");
		String usernamei = kb.next();
		System.out.println("What is your password? ");
		String passwordi = kb.next();
		
		if (passcheck(passwordi) && usercheck(usernamei))
		{
			System.out.println("You are granted access!");
		}
		else if (passcheck(passwordi) && !usercheck(usernamei))
		{
			System.out.println("Your username is incorrect! Try again.");
			recursion();
		}
		else if (!passcheck(passwordi) && usercheck(usernamei))
		{
			System.out.println("Your password is incorrect! Try again.");
			recursion();
		}
		else
		{
			System.out.println("Your username and password are incorrect! Try again.");
			recursion();
		}
	}
	public static boolean usercheck(String input)
	{
		if (input.equals(username))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean passcheck(String input)
	{
		if (input.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}