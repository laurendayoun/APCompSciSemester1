import java.util.Scanner;
public class Lab_05_02_Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the 'Choose your own adventure' game!");
		System.out.println("Please select a background: Forest or Beach");
		String background = kb.next();
		if (background.equals("Forest"))
		{
			System.out.println("Welcome to the Forest! Please select a companion: Horse or Eagle");
			String companion = kb.next();
			if (companion.equals("Horse"))
			{
				System.out.println("Please name your horse: ");
				String horse = kb.next();
				System.out.println("Oh no! " + horse + " got hurt! Will you save " + horse + "?");
				System.out.println("Please select a course of action: Save or Leave");
				String horseaction = kb.next();
				if (horseaction.equals("Save"))
				{
					System.out.println("Yay! You saved " + horse + ". Now you can live happily ever after :)");
				}
				else
				{
					System.out.println("Oh no! " + horse + " died :( You will now feel sad and empty for the rest of your life.");
				}
			}
			else
			{
				System.out.println("Please name your eagle: ");
				String eagle = kb.next();
				System.out.println(eagle + " wants to fly away. What will you do?");
				System.out.println("Please select a course of action: Keep or Release");
				String eagleaction = kb.next();
				if (eagleaction.equals("Keep"))
				{
					System.out.println(eagle + " died because it couldn't live a caged life. You will now feel regret for the rest of your life.");
				}
				else
				{
					System.out.println(eagle + " is happy now. If you were really meant to be, " + eagle + "will fly back.");
				}
			}
		}
		else
		{
			System.out.println("Welcome to the Beach!");
			System.out.println("Please select a course of action: Swim or Sunbathe ");
			String beachaction = kb.next();
			if (beachaction.equals("Swim"))
			{
				System.out.println("Wow, swimming is so fun! \nThere are so many sea creatures around here. Which one do you want to make friends with? ");
				System.out.println("Please select a sea creature: Fish, Stingray, Seahorse, Turtle, Manatee");
				String seaanimal = kb.next();
				if (seaanimal.equals("Fish"))
				{
					System.out.println("Please name the fish: ");
					String name = kb.next();
					System.out.println("Oh no! " + name + " is now swimming away! Sad :(");
				}
				else if (seaanimal.equals("Stingray"))
				{
					System.out.println("Please name the stingray: ");
					String name = kb.next();
					System.out.println("Wow! " + name + " is now swimming towards you. How cool!");
				}
				else if (seaanimal.equals("Seahorse"))
				{
					System.out.println("Please name the seahorse: ");
					String name = kb.next();
					System.out.println(name + " looks like its seahorse children are here. Do you want to go say hi to the little seahorses? Yes or No?");
					String yn = kb.next();
					if (yn.equals("Yes"))
					{
						System.out.println("Awww! The little seahorses are so cute :)");
					}
					else
					{
						System.out.println("Okay. The seahorses left anyways. Have a nice day!");
					}
				}
				else if (seaanimal.equals("Turtle"))
				{
					System.out.println("Please name the turtle: ");
					String name = kb.next();
					System.out.println("Oh no! " + name + " looks like its in trouble! Will you go save it?");
					System.out.println("Please select a course of action: Save or Leave");
					String saveorleave = kb.next();
					if (saveorleave.equals("Save"))
					{
						System.out.println("You saved " + name + "! Yay! Now you can happily search the ocean together.");
					}
					else
					{
						System.out.println(name + " died. You will now live with sadness and regret forever.");
					}
				}
				else
				{
					System.out.println("Please name the manatee: ");
					String name = kb.next();
					System.out.println(name + " looks really friendly. Go say hi!");
				}
			}
			else
			{
				System.out.println("The sun is really strong today. Did you bring sunscreen? Yes or No? ");
				String response = kb.next();
				if (response.equals("Yes"))
				{
					System.out.println("Great! Did you put on sunscreen yet? Yes or No?");
					String yorn = kb.next();
					if (yorn.equals("Yes"))
					{
						System.out.println("Great! Have fun sunbathing! :)");
					}
					else
					{
						System.out.println("Oh no! Go put some on before you get skin cancer!");
					}
				}
				else
				{
					System.out.println("You should really go buy sunscreen. Do you need to know where the nearest store is? Yes or No?");
					String yesorno = kb.next();
					if (yesorno.equals("Yes"))
					{
						System.out.println("Great! Leave the beach, go left for 4 miles and then turn right on First Street. Have fun!");
					}
					else
					{
						System.out.println("Okay. Be careful and have a great day!");
					}
				}
			}
		}
	}

}