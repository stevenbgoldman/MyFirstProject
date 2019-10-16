import java.util.Scanner;

public class Application2 
{

	public static void main(String[] args)
	{
		String input1 = "";
		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the string: ");
		input1 = input.next();
		System.out.println("Enter the character to count:");
		String input2 = input.next();
		char c = input2.charAt(0);
		
		countChar(input1,c);
		
		
	}

	public static void countChar(String str, char c)
	{
		int count = 0;
		for(int i=0; i < str.length(); i++)
		{    
			if(str.charAt(i) == c)
			{
				count++;
			}
		
		}
    System.out.println("Character " + str + " apperas " + count + " times.");
	} 	
}