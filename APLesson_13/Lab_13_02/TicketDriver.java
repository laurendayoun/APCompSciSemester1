public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket t1 = new Walkup();
		Ticket t2 = new Advance(5);
		Ticket t3 = new StudentAdvance(20);
	
		System.out.print(t1 + "\n" + t2 + "\n" + t3);
	}
}