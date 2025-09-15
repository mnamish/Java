import java.util.*;

public class SetOperations {
	
	private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }


    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first set
        System.out.println("Enter numbers for the first set (space-separated):");
        Set<Integer> set1 = 

        // Read the second set
        System.out.println("Enter numbers for the second set (space-separated):");
        Set<Integer> set2 = 

        // Display the sets
        System.out.println("First set: " + set1);
        System.out.println("Second set: " + set2);

        // Perform set operations
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference (set1 - set2): " + difference(set1, set2));
        System.out.println("Difference (set2 - set1): " + difference(set2, set1));
    }
}
