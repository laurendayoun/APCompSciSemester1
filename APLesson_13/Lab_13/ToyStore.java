import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = null;
	}
	
	public ToyStore(String list)
	{
		toyList = new ArrayList<Toy>();
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		String[] toyss = ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toyss));
		
		
		for (int i=0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			Toy t = getThatToy(name);
			
			if (getThatToy(name) == null)
			{
				if (type.equals("Car"))
				{
					Car newcar = new Car(name);
					toyList.add(newcar);
				}
				
				else
				{
					AFigure newfig = new AFigure(name);
					toyList.add(newfig);
				}
			}
			
			else
			{
				
				t.setCount(t.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		if (toyList.size() > 0)
		{
			for (Toy t: toyList)
			{
				if (t.getName().equals(nm))
				{
					return t;
				}
			}
		}
		
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		
		for (Toy t: toyList)
		{
			if (max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for (Toy t: toyList)
		{
			if (t.getType().equals("Car"))
			{
				cars++;
			}
			
			else
			{
				figures++;
			}
		}
		
		if (figures > cars)
		{
			return "There are more Action Figures.";
		}
		
		if (figures < cars)
		{
			return "There are more Cars.";
		}
		
		else
		{
			return "There are equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList + "\nThe most frequent toy is " + getMostFrequentToy() + ".\n" + getMostFrequentType();
	}
}