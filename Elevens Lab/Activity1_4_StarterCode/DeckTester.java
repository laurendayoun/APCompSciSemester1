/**
 * This is a class that tests the Deck class.
 */
 
import java.util.ArrayList;
 
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] ranks = {"King", "Queen", "Jack", "10", "9"};
		String[] suits = {"Diamonds", "Hearts"};
		int[] pointValues = {1, 2, 3, 4, 5};
		
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println("How big is the deck? Is the deck empty? " +
			 d.size() + ", " + d.isEmpty());

		int n = d.size();
		
		for (int i = 0; i < n; i++)
		{
			d.deal();
		}
		
		System.out.println("Is the deck empty now? " + d.size() + " " +  d.isEmpty());
	}
	
}
