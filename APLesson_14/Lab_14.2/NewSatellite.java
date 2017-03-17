import java.util.ArrayList;
public class NewSatellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

        double[] home = {0, 0};
		
	

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

	   printout += "\n\n" + "=========================="; 
		
		for (Location a : locate)
		{
			int one = (int)(Math.random()*100+1);
			int two = (int)(Math.random()*100+1);
			
			a.move(one, two);
			printout += "\n\nAfter " + a.getID() + " Moved (" + one + ", " + two +
			") \nNew Location: (" + getLocation(a.getLoc()) + ")";
		}
		
		printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
		
		System.out.println(printout);
		
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}