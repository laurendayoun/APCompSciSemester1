public class Lab_02
{
	public static void main(String[]args)
	{
		// Part 1
		int a = 2;         
		int b = 4;
		System.out.println(a +" multiplied by " + b + " is " +a*b);
		// Part 2
		String Name = "Torrey Pines";
		String Address = "3710 Del Mar Heights Rd";
		String CityStateZipCode = "San Diego, CA 92130";
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(CityStateZipCode);
		//Part 3
		int l = 2;
		int w = 4;
		int h = 8;
		int SurfaceArea = 2*l*w + 2*w*h + 2*l*h;
		String introstatement = "The surface area of your ";
		String by = " by ";
		System.out.println(introstatement + l + by + w + by + h + " rectangular solid is " + SurfaceArea);
		
	}
}