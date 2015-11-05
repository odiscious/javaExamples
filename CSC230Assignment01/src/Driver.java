import java.util.*;
/*
 * Assumptions: 
 * All data entered is of, true,correct, and expected, values.
 * At least one student is enrolled in the class
 * If user indicates a user is to be dropped, at least one student is dropped.
 * Program Functionality:
 * Prompts users to enter the number of students and their names in this course.
 * Displays the total number of students in the class and their names.
 * Deletes the names of the students who drop the class.
 * Displays how many students dropped and their names.
 * 
 * Note: This program is tested only for basic functionality.  Improvements certainly
 * could be made and it's not perfect nor the only way to complete this assignment
 */
public class Driver{
	public static void main(String[] args)
	{
		ArrayList<String> students = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students in this course and all their names with a space. "
				+ "Note: the number of students must be greater than or equal to one" + "Hit enter when done: ");
		Scanner token = new Scanner(input.nextLine());
		
		int sizeOfClass = token.nextInt();
		
		//loops through all, if any, of the users d1ata via the console and adds it
		//to the list of students
		while(token.hasNext())
		{			
			students.add(token.next());			
		}
		
		//prints out the total number of students in the class
		System.out.println("The total number of students in the class is: " + sizeOfClass);
		System.out.println("The name of the students are (unordered): ");
		//prints out all of the students names on a separate line
		for(int i = 0; i < sizeOfClass; i++)
		{
			System.out.println(students.get(i));
		}
		
		System.out.println("Do you have any students to drop from this class?");
		token = new Scanner(input.nextLine());
		String result = token.next().toLowerCase();
		boolean isTrue = true;
		if( result.compareTo("no") == 0)
		{
			isTrue = false;
		}
		ArrayList<String> dropped = new ArrayList<String>();
		if(isTrue)
		{
			while(isTrue)
			{
				System.out.println("Enter the name of the student who has dropped the class: ");
				String name = input.next();
				dropped.add(name);
				System.out.println("Do you have more students to drop from the class?");
				name = input.next().toLowerCase();
				if(name.compareTo("no") == 0)
				{
					break;
				}
			}
			System.out.println("The number of students that dropped the class is: " + dropped.size());
			System.out.println("The names of the students that dropped, "
					+ "in the order in which they were dropped, from the class are: ");
			for(int i = 0; i < dropped.size(); i++)
			{
				System.out.println(dropped.get(i));
			}
			System.out.println("End of Line...");
			//Closes out the Scanner Object
			input.close();
			token.close();
		}
		else
			System.out.println("No students were dropped from the class, end of line... ");		
	}
}