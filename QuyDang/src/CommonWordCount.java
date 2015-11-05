
import java.util.*;
import java.io.*;


public class CommonWordCount
{
	public static void main(String[] args)  throws FileNotFoundException 
	{
		
		CommonWords cw = new CommonWords();
		cw.determineCommonWords(new File("C:/Users/Odiscious/Downloads/Hamlet.txt")
				, new File("C:/Users/Odiscious/Downloads/KingLear.txt"));
		int pennies = 1003;
		int quarters = 0;
		int nickels = 0;
		int dimes = 0;
		
		quarters = pennies / 25;
		pennies = pennies % 25;
		dimes = pennies / 10;
		pennies = pennies % 10;
		nickels = pennies / 5;
		pennies = pennies % 5;
		System.out.println("quarters: " + quarters + "\tdimes: " + dimes + "\tnickels: " + nickels + "\tpennies: " + pennies);
		
        
	}

	

   
    
}  
