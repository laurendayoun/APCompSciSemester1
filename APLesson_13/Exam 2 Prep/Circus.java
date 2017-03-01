public class Circus
{
	public static void main(String[]args)
	{
		CircusPerformer sue = new Equestrian("Sue", "Amazing Ponies");
		sue.act();
		
		TightRopeWalker joe = new TightRopeWalker("Joe", "Feats of Daring");
		joe.act();
		
		HighWireJuggler kathy = new HighWireJuggler("Kathy", "High Wire Juggling");
		kathy.act();
	}
}