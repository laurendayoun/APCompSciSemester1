/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card DK = new Card("King", "Diamonds", 10);
		Card DQ = new Card("Queen", "Diamonds", 10);
		Card DK2 = new Card("King", "Diamonds", 10);
		
		System.out.println(DK);
		System.out.println("Are DK and DQ the same? What about DK and DK2? " 
			+ DK.matches(DQ) + ", " + DK.matches(DK2));
	}
}
