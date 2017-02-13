public abstract class TheConsole extends TheGameSystem
{
	private String platform;
	private int serialNo;
	
	public TheConsole()
	{
		super();
	}
	
	public TheConsole(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + 
		"\nSerial #: " + getSerial() + "\nController: " + getController();
	}
}