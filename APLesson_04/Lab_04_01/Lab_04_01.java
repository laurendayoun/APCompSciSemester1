import java.util.Scanner;

public class Lab_04_01
{
	public static void main(String[]args)
	{
		Lab_04_01 self = new Lab_04_01();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		String throwaway1 = kb.nextLine();
		
		
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		String throwaway2 = kb.nextLine();
		
		
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * 0.08;
		double totalprice = subtotal + tax;
		
		System.out.println("<<<<<<<<<<<<<<<< ______Receipt______ >>>>>>>>>>>>>>>");
		self.receiptline(item1, price1);
		self.receiptline(item2, price2);
		self.receiptline(item3, price3);
		self.receiptline("Subtotal:", subtotal);
		self.receiptline("Tax:", tax);
		self.receiptline("Total:", totalprice);
		System.out.println("\n______________________________________________________");
		System.out.println(" *   Thank you for your support   *");
		
	}
	
	public void receiptline(String item, double price)
	{
		System.out.printf("\n*  %25s . . . . . .\t%10.2f", item, price);
	}
}