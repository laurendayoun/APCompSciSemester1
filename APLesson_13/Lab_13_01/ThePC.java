public class ThePC extends TheGameSystem
{
	private String platform;
	private int serialNo;
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String getPlatform()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerial() + "\nSystem Input: " + 
		systemInput();
	}
}