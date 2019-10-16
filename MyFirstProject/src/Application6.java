//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

public class Application6 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		String input2 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.nextLine();
		System.out.print("Enter number of times to print out string: ");
		input2 = input.next();
		
		int i =Integer.parseInt(input2);
		if (i <= 0)
		{
			System.out.println("You have enter an incorrect value for the number of times:");
		}
		else 
		{
			printStringNTimes(input1, i);
		}
		

	}	
		
	public static void printStringNTimes(String word, int loop)
	{
		
        for (int i = 0; i < loop; i++) 
        { 
          System.out.print(word);  
        } 
     
    }
}


