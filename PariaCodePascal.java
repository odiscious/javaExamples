
import java.util.*;
public class PascalTriangle
{
public static final int MIN = 1;
public static final int MAX = 12;

public static void main(String[] args) { 
Scanner console = new Scanner(System.in); 
System.out.print("Enter the row number between range (1-12) in which Pascal's triangle has to be printed: ");
 int row = console.nextInt(); pascal(row); } // End method: main(String[]) 
 
	 public static void pascal (int numFromUser) {
	 for(int i =0; i< numFromUser ; i++) 
	 { int number =1; 
	 System.out.printf("%"+(numFromUser -i)*2+"s",""); 
		for(int j=0; j<=i; j++) 
		{ 
			System.out.printf("%4d",number); 
			number = number * (i - j) / (j + 1); 
		} 
		System.out.println(); 
		} 
	} 
} // End class definition: PascalTriangle