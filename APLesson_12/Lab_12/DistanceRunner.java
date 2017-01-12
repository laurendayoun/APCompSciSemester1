import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the x coordinate of the first point?");
		int x1 = kb.nextInt();
		System.out.println("What is the y coordinate of the first point?");
		int y1 = kb.nextInt();
		System.out.println("What is the x coordinate of the second point?");
		int x2 = kb.nextInt();
		System.out.println("What is the y coordinate of the second point?");
		int y2 = kb.nextInt();
		
		Lab_12_Distance self = new Lab_12_Distance(x1, y1, x2, y2);
		System.out.println("The distance between (" + self.getx1() + ", " + self.gety1() + ") and (" + self.getx2() + ", " + self.gety2() + ") is " + self.getDist()); 
		
		self.setValues(1, 3, 4, 7);
		System.out.println("The distance between (" + self.getx1() + ", " + self.gety1() + ") and (" + self.getx2() + ", " + self.gety2() + ") is " + self.getDist()); 
	}
}