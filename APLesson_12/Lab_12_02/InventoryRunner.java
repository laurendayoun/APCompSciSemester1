import java.util.Scanner;
public class InventoryRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the item name?");
		String nm = kb.next();
		System.out.println("What is its manufacturer?");
		String manufct = kb.next();
		System.out.println("Would you like to enter a category and price? (y or n)");
		String answer = kb.next();
		
		if (answer.equals("y"))
		{
			System.out.println("What is the category?");
			String cat = kb.next();
			System.out.println("What is the price?");
			String pr = kb.next();
			
			Inventory item = new Inventory(manufct, nm, cat, pr);
			System.out.println(item);
		}
		else
		{
			Inventory item = new Inventory(manufct, nm);
			System.out.println(item);
		}
	}
}