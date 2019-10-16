//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

public class Application7 
{

	public static void main(String[] args) 
	{
		String input1 = "";
		String input2 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		input1 = input.nextLine();
		System.out.print("Please enter the pattern: ");
		input2 = input.nextLine();       
        
		countFreq(input1, input2);
	}
	public static void countFreq(String txt, String pat) 
	{         
        	int M = pat.length();         
        	int N = txt.length();         
        	int res = 0; 
  
        /* A loop to slide pat[] one by one */
        /* For current index i, check for pattern match */
        for (int i = 0; i <= N - M; i++) 
	    { 
            int j;             
            for (j = 0; j < M; j++) 
            { 
                if (txt.charAt(i + j) != pat.charAt(j))
                { 
                    break; 
                } 
            } 
  
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
            if (j == M) 
            {                 
                res++;                 
                j = 0;                 
            }             
        }         
      System.out.println("String: " + txt + " has pattern: " + pat + " in it " + res + " times.");          
    }	
}