import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the distance?");
		int distance = kb.nextInt();
		System.out.println("How many full hours was the trip?");
		int hours = kb.nextInt();
		System.out.println("How many additional minutes was the trip?");
		int minutes = kb.nextInt();
		
		Lab_12_MilesPerHour self = new Lab_12_MilesPerHour(distance, hours, minutes);
		System.out.println(self.getDistance() + " miles in " + self.getHours() + " hours and " + self.getMinutes() + " minutes is " + self.getMPH() + " MPH");

		self.setValues(500, 5, 30);
		System.out.println(self.getDistance() + " miles in " + self.getHours() + " hours and " + self.getMinutes() + " minutes is " + self.getMPH() + " MPH");
		
	}
}