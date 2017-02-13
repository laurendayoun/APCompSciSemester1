public class GameRunner
{
	public static void main(String[]args)
	{
		TheGameSystem gs1 = new Xbox();
		TheGameSystem gs2 = new PlayStation();
		TheGameSystem gs3 = new ThePC();
		
		System.out.println(gs1 + "\n" + gs2 + "\n" + gs3);
	}
}