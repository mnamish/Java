import java.util.*;

public class UniqueWordCounter {
    public static void main(String[] args) {
    	Set<String> names = new HashSet<>();
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentance = scanner.nextLine();
        
        String[] arr = sentance.split(" "); 
        
        for ( String ss : arr) {
           names.add(ss.toLowerCase());
        }
        
        System.out.println(names);
        System.out.println(names.size());
    }
}