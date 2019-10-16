//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*;

public class Application4 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.nextLine();
		
		findDuplicatesCharacters(input1);
	}	
		
	public static void findDuplicatesCharacters(String word)
	{
		char[] chars = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet())
        {
            if(map.get(c) > 1) 
            {
                System.out.println(c);
            }
            
       }
  }
}


