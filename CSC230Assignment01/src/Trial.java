import java.util.*;
public class Trial {
	public static void main(String[] args)
	{
		ArrayList<String> students = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students in this course and all their names with a space. Hit enter when done: ");
		String name = "";
		while(input.hasNextLine())
		{
			System.out.println("In the loop");
			name += input.next() + " ";
		}
		
		System.out.println(name);
		/*if(input.hasNext())
		{
			System.out.println("Positive test");
		}*/
	}
}
