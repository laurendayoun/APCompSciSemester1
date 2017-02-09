import java.util.Scanner;

public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the toys and their types, separated by a space and a comma:");
		
		String input = kb.nextLine();
		
		ToyStore ts = new ToyStore(input);
		
		System.out.println(ts);
	}
}