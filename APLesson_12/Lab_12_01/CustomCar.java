import java.util.Scanner;
public class CustomCar
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the color of your car?");
		String p = kb.nextLine();
		System.out.println("What is the interior of your car?");
		String i = kb.nextLine();
		System.out.println("What is the engine of your car?");
		String e = kb.nextLine();
		System.out.println("What are the tires of your car?");
		String t = kb.nextLine();
		
		ClassCar custom = new ClassCar(p, i, e, t);
		System.out.println("Your vehicle is ready. . . . . .");
		System.out.println("Paint:   " + custom.getPaint());
		System.out.println("Interior:   " + custom.getInterior());
		System.out.println("Engine:   " + custom.getEngine());
		System.out.println("Tires:   " + custom.getTires());
		
		custom.setCustom("red with gold flecks", "black leather", "5 litre v8 507hp", "20\" Priellis");
		System.out.println("\nHere is an alternative vehicle: ");
		System.out.println("Paint:   " + custom.getPaint());
		System.out.println("Interior:   " + custom.getInterior());
		System.out.println("Engine:   " + custom.getEngine());
		System.out.println("Tires:   " + custom.getTires());
	}
}