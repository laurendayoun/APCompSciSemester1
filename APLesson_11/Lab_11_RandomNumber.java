import java.util.Random;

public class Lab_11_RandomNumber
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[][] nums = new int [4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = rand.nextInt(101);
			}
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}