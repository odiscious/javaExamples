/*
 * Qtr:			Autumn 2015
 * Class:		CSC212
 * Professor:	Dr. Julian Achim
 * Programmer:	Odiscious Dozier
 * Date:		10/20/2015
 * 
 * conditions: program expects all appropriate
 * input from the user via console input
 * 
 */
import java.util.*;
public class SLP02 {
	public SLP02()
	{
		int result = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!  Please enter your taxable annual income. Note: use only positive whole numbers; "
				+ "for example, $45,000.00 should be entered as, 45000: ");
		int taxable = input.nextInt();
		
		if(taxable >= 0 && taxable < 8500){
			result = 10;
		}
		else if(taxable >= 85000 && taxable < 34500){
			result = 15;
		}
		else if(taxable > 34500 && taxable < 83600){
			result = 25;
		}
		else if(taxable > 83600 && taxable < 174400){
			result = 28;
		}
		else if(taxable > 174400 && taxable < 379150){
			result = 33;
		}
		else{
			result = 35;
		}
		System.out.format("Taxable income tax bracket tax percentage is: \t%d", result);
		System.out.print("%");
	}
}
