public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 self = new Lesson_04();
		
		String word1 = "blaaaah";
		double number1 = 444.2341;
		
		self.format(word1, number1);
		
		String word2 = "yessssss";
		double number2 = 567889.7126354;
		
		self.format(word2, number2);
	}
	public void format(String word, double number)
	{
		System.out.printf("\n%10s   %10.2f", word, number);
	}
}