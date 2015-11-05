import java.util.*;
public class Again {
	public static void main(String[] args)
	{
		ArrayList<String> students = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Do something: ");
		int first = input.nextInt();
		System.out.println("The number entered was: " + first);
		while(input.hasNext()){
			String name = input.next();
			System.out.println("name was: " + name);
			students.add(name);
		}
		System.out.println(students.toString());
	}
}
