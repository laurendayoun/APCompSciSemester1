import java.util.Random;
public class Lab_01
{
	public static void main(String[]args)
	{
		Lab_01 self = new Lab_01();
		int playerroll = (int)((Math.random() * 6 + 1));
		int comproll = (int)((Math.random() * 6 + 1));
		System.out.println("You rolled a " + playerroll + ".");
		System.out.println("The computer rolled a " + comproll + ".");
		
		self.rollDice(playerroll, comproll);
		
	}
	
	public static void rollDice(int player, int computer)
	{
		if(player > computer)
		{
			System.out.println("You won! Congrats!");
		}
		if(player < computer)
		{
			System.out.println("The computer won! Sorry :/(");
		}
		if(player == computer)
		{
			System.out.println("It's a tie!");
		}
	}
}
