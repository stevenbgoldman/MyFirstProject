import java.util.Scanner;

public class Application 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.next();
			
		String result = nonRepeatedChar(input1);
		System.out.println("Result of program =: " + result);
	}	
 // Modifier : public static 
 // Return Type: String
 // Name of Method: nonRepeatedChar
 // Parms: String word
		
		public static String nonRepeatedChar(String word)
		{
			
			String nonRepeated = "";
			String repeated = "";
			for (int i = 0; i < word.length(); i++)
			{
				char outterLetter = word.charAt(i);
				for (int j = 0; j < word.length(); j++)
				{
					char innerLetter = word.charAt(j);
					if (i !=j)
					{
						if (outterLetter == innerLetter)
						{
							repeated = repeated + outterLetter;
							break;
						}
						
						}
					if (j == word.length() - 1) 
					{
						nonRepeated = nonRepeated + outterLetter;
					}
				
				
				}
			}
			
					return nonRepeated + repeated;
		}
}

