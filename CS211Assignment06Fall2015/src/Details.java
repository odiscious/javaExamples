import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Details  {

	private static ArrayList<Student> students = new ArrayList<Student>();
	public static void main(String args[]) throws FileNotFoundException{
		
		processLine(new Scanner(
				new File("C:/Users/Odiscious/workspace/CS211Assignment06Fall2015/src/StudentRecords.txt")));
	
	   /*arraylist.add(new Student("Smith", "Kelly", 438975, 98.60, 'A'));
	   arraylist.add(new Student("Johnson", "Gus", 210498, 72.40, 'C'));
	   arraylist.add(new Student("Reges", "Stu", 998736, 88.20, 'B'));
	   arraylist.add(new Student("Smith", "Marty",	346282, 84.1,'B'));
	   arraylist.add(new Student("Reges", "Abe", 298575, 78.3,	'C'));
	   arraylist.add(new Student("Evans", "Christian", 345764, 61.3, 'D'));
	   arraylist.add(new Student("Lawson", "Craig", 298574,	88.3, 'B'));
	   arraylist.add(new Student("Newberry", "Susan", 136356, 91.3,	'A'));
	   arraylist.add(new Student("Hitch", "Debi", 786543, 89.3,	'B'));
	   arraylist.add(new Student("Maxwell",	"Cheryl", 563653, 74.2, 'C'));*/

	
	System.out.println("Student Records, as read from the database file:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
	
			for(Student str1: students){
			System.out.println(str1);
			}
		  	 
	System.out.println();
	  	   
	  	
	System.out.println("Student Records, after sorting by last name:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
		Collections.sort(students, Student.LastNameComparator);
			for(Student str: students){
			System.out.println(str);
			}
	
	System.out.println();	
	   		
	  	 
	System.out.println("Student Records, after sorting by first name:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
		Collections.sort(students, Student.FirstNameComparator);
			for(Student str: students){
			System.out.println(str);
			}
	
	System.out.println();

	   
	System.out.println("Student Records, after sorting by student ID:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
		Collections.sort(students, Student.IdNumberComparator);
			for(Student str: students){
			System.out.println(str);
			}
		   
	System.out.println();
	   
	   
	System.out.println("Student Records, after sorting by average:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
		Collections.sort(students, Student.AverageComparator);
			for(Student str: students){
			System.out.println(str);
			}
	
	System.out.println();
	   		
	   		
	System.out.println("Student Records, after sorting by grade:");
	System.out.println("Last Name\t" + "First Name\t" + "  ID\t" + "Average\t" + "Grade" );
	System.out.println("---------\t" + "----------\t" + "------\t" + "-------\t" + "------" );
		Collections.sort(students, Student.GradeComparator);
			for(Student str: students){
			System.out.println(str);
			}
	
	System.out.println();
  		
	}
	public static void processLine(Scanner file) {
			
			while(file.hasNextLine())
			{
				Student student = new Student();
				Scanner line = new Scanner(file.nextLine());
				
				student.setLastName(line.next());
				student.setFirstName(line.next());
				student.setIdNumber(line.nextInt());
				student.setAverage(line.nextDouble());
				student.setGrade(line.next().charAt(0));
				students.add(student);
			}
			
	}
}