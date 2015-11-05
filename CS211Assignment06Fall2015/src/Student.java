import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int idNumber;
    private double average;
    private char grade;
    
    //constructor
    public Student(){
    	this.firstName = "";
        this.lastName = "";
        this.idNumber = 0;
        this.average = 0.0;
        this. grade = ' ';
    }

    //overloaded constructor
    public Student(String firstName, String lastName, int idNumber, double average, char grade) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.idNumber = idNumber;
         this.average = average;
         this. grade = grade;
    }

    public String getFirstName() {
         return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
   }
   
   public void setLastName(String lastName) {
	   	this.lastName = lastName;
   }
    
    public int getIdNumber() {
    	return idNumber;
    }
    
    public void setIdNumber(int idNumber) {
    	this.idNumber = idNumber;
    }
    
    public double getAverage() {
    	return average;
    }
    
    public void setAverage(double average) {
    	this.average = average;
    }
    
    public char getGrade() {
    	return grade;
    }
    
    public void setGrade(char grade) {
    	this.grade = grade;
    }
    
    
        
    public static Comparator<Student> FirstNameComparator = new Comparator<Student>() {

    	public int compare(Student s1, Student s2) {
    	   String StudentName1 = s1.getFirstName();

    	   String StudentName2 = s2.getFirstName();

    	   //ascending order
    	   return StudentName1.compareTo(StudentName2);

    	   //descending order
    	   //return StudentName2.compareTo(StudentName1);
        }
    
    };
    
    
    public static Comparator<Student> LastNameComparator = new Comparator<Student>() {

    	public int compare(Student s1, Student s2) {
    	   String StudentName1 = s1.getLastName();

    	   String StudentName2 = s2.getLastName();

    	   //ascending order
    	   return StudentName1.compareTo(StudentName2);

    	   //descending order
    	   //return StudentName2.compareTo(StudentName1);
        }
    
    };

        
    
    
        public static Comparator<Student> IdNumberComparator = new Comparator<Student>() {

        	public int compare(Student s1, Student s2) {

        		int number1 = s1.getIdNumber();
        		int number2 = s2.getIdNumber();

        		/*For ascending order*/
        		return number1 - number2;

        		/*For descending order*/
        		//rollno2-rollno1;
        	}
    	
        };
        
        
        public static Comparator<Student> AverageComparator = new Comparator<Student>() {

        	public int compare(Student s1, Student s2) {

        		double number1 = s1.getAverage();
        		double number2 = s2.getAverage();

        		/*For ascending order*/
        		return (int) (number1 - number2);
        		
        	}
    	
        };
        
        
        public static Comparator<Student> GradeComparator = new Comparator<Student>() {

        	public int compare(Student s1, Student s2) {

        		int number1 = s1.getGrade();
        		int number2 = s2.getGrade();

        		/*For ascending order*/
        		return number1 - number2;

        	}
    	
        };
        
       
        public String toString() {
        	
    		return String.format("%-8s\t%-8s\t%-6d\t%6.2f\t%3c",lastName ,firstName , idNumber, average, grade);
    	}

}