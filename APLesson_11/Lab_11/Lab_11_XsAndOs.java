import java.util.Random;

public class Lab_11_XsAndOs
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		String[][] XandO = new String [4][4];
		
		for(int i = 0; i < XandO.length; i++)
		{
			for (int j = 0; j < XandO[i].length; j++)
			{
				int pick = rand.nextInt(2) + 1;
				if (pick == 1)
				{
					XandO[i][j] = "X";
				}
				else
				{
					XandO[i][j] = "O";
				}
				System.out.print(XandO[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}