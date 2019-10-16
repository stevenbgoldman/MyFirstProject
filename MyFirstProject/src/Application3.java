import java.util.Scanner;

public class Application3 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.nextLine();
		
		removeWhiteSpace(input1);
		
		input.close();
	}	
		
	public static void removeWhiteSpace(String word)
	{
		
		char[] charArray = word.toCharArray();
        
        String stringWithoutSpaces = "";
         
        for (int i = 0; i < charArray.length; i++) 
        {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }
         
        System.out.println("Input String: "+ word);
         
        System.out.println("Input String Without Spaces: " + stringWithoutSpaces);
       
	}		
}

