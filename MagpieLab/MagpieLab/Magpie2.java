public class Magpie2
{
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		 
		if (statement.length() == 0 || statement.trim().length() == 0)
		{
			System.out.println("Say something, please.");
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (findKeyword(statement, "cat") >= 0 
				|| findKeyword(statement, "dog") >= 0 
				|| findKeyword(statement, "fish") >= 0 
				|| findKeyword(statement, "turtle") >= 0)
		{
			response = "Tell me more about your pet";
		}
		
		else if (findKeyword(statement, "robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher";
		}

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			int psn = findKeyword(statement, "you", 0);

			if (findKeyword(statement, "me", psn) >= 0
			|| findKeyword(statement, "me.", psn) >= 0 
			&& psn >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
		
	}
	
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		Character lastCha = statement.charAt(statement.length() - 1);
		String lastChar = lastCha.toString();
		
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psn = findKeyword(statement, "I want to");
		
		String restofStatement = statement.substring(psn + 9);
		
		return "What would it mean to" + restofStatement;
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		Character lastCha = statement.charAt(statement.length() - 1);
		String lastChar = lastCha.toString();
		
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnofYou = findKeyword(statement, "you");
		int psnofMe = findKeyword(statement, "me", psnofYou + 3);
		
		String restofStatement = statement.substring(psnofYou + 3, psnofMe);
		
		return "What makes you think that I" + restofStatement + "you?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		phrase = phrase.toLowerCase();
		goal = goal.toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
		
		while (psn >= 0)
		{
			if (psn > 0)
			{
				String beforeall = phrase.substring(0, psn);
				Character b = phrase.charAt(psn - 1);
				String before = b.toString();
				
				if (goal.length() >= (phrase.length() - beforeall.length()))
				{
					String after = phrase.substring(psn + goal.length());
					if (!(before.compareTo("zz") > 0)
						&& !(after.compareTo("zzz") > 0))
					{
						return psn;
					}
				}
				
				else
				{
					psn = phrase.indexOf(goal, psn + 1); 
				}
			}
			return psn;
		}

		return -1;
	}
	
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
