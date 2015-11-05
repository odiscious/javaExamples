import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CommonWords {
	//fields
	
	//contructor(s)
	public CommonWords() {
	}
	
	//member functions
	public void determineCommonWords(File file1, File file2) throws FileNotFoundException{
		Scanner input1 = new Scanner(new File("C:/Users/Odiscious/Downloads/Hamlet.txt"));      
        
        Scanner input2 = new Scanner(new File("C:/Users/Odiscious/Downloads/KingLear.txt"));
        System.out.println();

        
        Map<String, Integer> list1 = getWords(input1);
        Map<String, Integer> list2 = getWords(input2);
        
        Set<String> overlap = new TreeSet<String>(list1.keySet());
        overlap.retainAll(list2.keySet());

        printStatics(list1.keySet(), list2.keySet(), overlap, 
        		new File("C:/Users/Odiscious/Downloads/Hamlet.txt"), 
        		new File("C:/Users/Odiscious/Downloads/KingLear.txt"));

        for(String word : overlap)
		{
			System.out.printf(word +"     \t"+ list1.get(word) + "\t" + list2.get(word) + "\n", .2);
		}
		
		input1.close();
		input2.close();
	}
	
	public void giveIntro()
    {
        System.out.println(
        		"          Chapter 11, Assigned Project #4\n" +
        	  "\nThis program determines the distinct words in two different books" +
        	  "\n(from disk files) and the number of times each word occurs in the" +
        	  "\nfile, determines the common words in both files, and final displays" +
			  "\nthe result.");
	}
	    
	    	
    public Map<String, Integer> getWords(Scanner input)
    {
    	
        Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
        
    	
        input.useDelimiter("[^a-zA-Z]+");
    	
        while (input.hasNext() )
        {
        	
            String next = input.next().toLowerCase();
            
            if (wordsCount.containsKey(next)) {
				int count = wordsCount.get(next);
				wordsCount.put(next,  count + 1);
			} else {
				wordsCount.put(next, 1);
			}
		}
		
		return wordsCount;
            
     }
	    
	 public void printStatics(Set<String> set1, Set<String> set2,
	                                     Set<String> overlap, File file1, File file2)
    {
    	    	
    	System.out.println("Statistics for file: " + file1 + ".txt" +
    						"\nThere are a total of " + set1.size() + " words in the file" +
        					"\nOf those, " + overlap.size() +  " were ignored," +
    						"\nleaving" + (set1.size() - overlap.size()) + " words to process " +
        					"\nAfter processing, there are " + overlap.size() + " distinct words in the file");
        
    	System.out.println();
    	
    	System.out.println("There are " + overlap.size() + "common words itn files " + file1 + " and " + file2 + "." +
    						"\nThe common words are: ");

        
        System.out.println("\tWord" + "\t\t" + file1 + ".txt" + "\t" + file2 + ".txt");
		System.out.println("    ------------\t------------\t------------");
		
     }
	   
	 public void printResult (Set<String> overlap, Map<String, Integer> list1, Map<String, Integer> list2)
	 {
	       
	   for (String str : overlap) {
		
		   int b = list1.get(str);
		   int c = list2.get(str);
		
		   System.out.printf("    %s\t%22d\t%14d", str, b, c);	
	   }

	 }
}
