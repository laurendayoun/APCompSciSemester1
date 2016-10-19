import java.util.Scanner;
public class Lab_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the name of the first item: ");
		String name1 = kb.next();
		System.out.println("Please input the price of the first item: ");
		double item1 = kb.nextDouble();
		System.out.println("Please input the name of the second item: ");
		String name2 = kb.next();
		System.out.println("Please input the price of the second item: ");
		double item2 = kb.nextDouble();
		System.out.println("Please input the name of the third item: ");
		String name3 = kb.next();
		System.out.println("Please input the price of the third item: ");
		double item3 = kb.nextDouble();
		System.out.println("Please input the name of the fourth item: ");
		String name4 = kb.next();
		System.out.println("Please input the price of the fourth item: ");
		double item4 = kb.nextDouble();
		double subtotal = item1 + item2 + item3 + item4;
		double discount = discount(subtotal);
		double tax = (subtotal - discount) * 0.08;
		double total = subtotal - discount + tax;
		System.out.println("<<<<<<<<<<<<<<<<<<<<<  Receipt  >>>>>>>>>>>>>>>>>>>>>");
		format(name1, item1);
		format(name2, item2);
		format(name3, item3);
		format(name4, item4);
		format("Subtotal", subtotal);
		format("Discount", discount);
		format("Tax", tax);
		format("Total", total);
		System.out.println("\n_______________________________________________________");
		System.out.println("Thank you for your visit!");
		
	}
	
	public static double discount(double total)
	{
		if(total >= 2000)
		{
			double discount = total * 0.15;
			return discount;
		}
		if(total < 2000)
		{
			int discount = 0;
			return discount;
		}
		return 0;
	}
	
	public static void format(String name, double price)
	{
		System.out.printf("\n%12s . . . . . . . . . . . . . . %3.2f", name, price);
	}
	
}