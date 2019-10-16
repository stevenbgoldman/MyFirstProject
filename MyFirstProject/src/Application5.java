//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

public class Application5 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.nextLine();
		
		System.out.println(reverseWords(input1));

	}	
		
	public static String reverseWords(String word)
	{
		// Specifying the pattern to be searched 
        Pattern pattern = Pattern.compile("\\s"); 
        // string result ="";
        // string[] parsedString = word.split(" ");
        //for (int i=parsedString.length - 1); i>0; i--
        // result = result + parsedString[i] + " ";
        // splitting String str with a pattern 
        // (i.e )splitting the string whenever their 
        //  is whitespace and store in temp array. 
        String[] temp = pattern.split(word); 
        String result = ""; 
  
        // Iterate over the temp array and store 
        // the string in reverse order. 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result;
    }
}


