public class Toyota extends Car
{
	
	public Toyota(String a)
	{
		String[] locstring = a.split(", ");
		this.location[0] = Double.parseDouble(locstring[0]);
		this.location[1] = Double.parseDouble(locstring[1]);
	}

}