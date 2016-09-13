import java.util.Scanner; // import statement

public class Lab_03_01
{
	public static void main(String[]args)
	{
		System.out.println("Hi, my name is RudeAI. \nI'd like to ask you a few questions.");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = keyboard.next();
		System.out.println(name + "?!! Why would anyone name their baby that?");
		
		System.out.println("How old are you, " + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Wow! " + age + " is such a horrible age.");
		
		System.out.println("What do you do for fun, " + name + "?");
		String for_fun = keyboard.next();
		System.out.println("I thought only losers did lame activities like " + for_fun + ".");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println(music + "?! That's the worst taste in music that I've ever heard of!");
		
		System.out.println("How many siblings do you have?");
		int sib_num = keyboard.nextInt();
		System.out.println(sib_num + "? Wow, I hope the rest of your family looks better than you");
		
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println(job + "? Are you sure? I heard that's a horrible job to have.");
		
		System.out.println("So, " + name + ", to clarify, you're " + age + " years old,");
		System.out.println("You like to " + for_fun + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + ". \nI hope you fail.");
		System.out.println("I'm only kiddin' " + name + ".");

	}
}