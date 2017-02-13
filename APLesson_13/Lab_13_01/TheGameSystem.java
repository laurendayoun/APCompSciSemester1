public class TheGameSystem
{
	private String platform;
	private int serialNo;
	
	public TheGameSystem()
	{
		this.platform = "";
	}
	
	public TheGameSystem(String p)
	{
		this.platform = p;
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerial()
	{
		serialNo = (int)(Math.random()*100000000) + 1;
		return serialNo;
	}
}