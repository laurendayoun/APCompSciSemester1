public class Inventory
{
	private String manuf, name, category, price;
	private int UPC;
	
	public Inventory(String mn, String nm)
	{
		manuf = mn;
		name = nm;
		category = "Undefined";
		UPC = (int)(Math.random()*1000000) + 1;
		price = "N/A";
	}
	
	public Inventory(String mn, String nm, String cat, String p)
	{
		manuf = mn;
		name = nm;
		category = cat;
		UPC = (int)(Math.random()*1000000) + 1;
		price = p;
	}
	
	public String toString()
	{
		return "Item Info...\nName: " + name + "\nManufacturer: " + manuf + "\nCategory: " + category + "\nUPC: " + UPC + "\nPrice: " + price; 
	}
}