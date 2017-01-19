public class User
{
	private String firstname, lastname, avatar;
	private int userID;
	
	public User(String fN, String lN)
	{
		firstname = fN;
		lastname = lN;
		avatar = "Undefined";
		userID = (int)(Math.random()*1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstname = fN;
		lastname = lN;
		avatar = av;
		userID = (int)(Math.random()*1000000) + 1;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstname + "\nLast Name: " + lastname + "\nAvatar: " + avatar + "\nUserID: " + userID; 
	}
}