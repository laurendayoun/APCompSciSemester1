import java.util.Scanner;
public class CustomHuman
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your hair color?");
		String h = kb.next();
		System.out.println("What is your eye color?");
		String e = kb.next();
		System.out.println("What is your skin color?");
		String s = kb.next();
		
		ClassHuman custom = new ClassHuman(h, e, s);
		
		System.out.println("My info. . . \nHair:  " + custom.getHair() + "\nEyes:  " + custom.getEyes() + "\nSkin:  " + custom.getSkin());
		
		custom.setHES("blonde", "blue", "white");
		System.out.println("Friend's info. . . \nHair:  " + custom.getHair() + "\nEyes:  " + custom.getEyes() + "\nSkin:  " + custom.getSkin());
	}
}