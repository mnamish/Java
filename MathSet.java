package Sets;

import java.util.HashSet;
import java.util.Set;

public class MathSet {
    private Set<Integer> setA;
    private Set<Integer> setB;

    // Constructor to initialize the sets
    public MathSet(String lineA, String lineB) {
        setA = parseLineToSet(lineA);
        setB = parseLineToSet(lineB);
    }

    //Helper
    private Set<Integer> parseLineToSet(String line) {
        Set<Integer> set = new HashSet<>();
        String[] elements = line.split(" ");  
        for (String element : elements) {
            set.add(Integer.parseInt(element)); 
        }
        return set;
    }

    // Method for union
    public Set<Integer> union() {
        Set<Integer> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    // Method for intersection
    public Set<Integer> intersection() {
        Set<Integer> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    // Method for difference A-B
    public Set<Integer> differenceAMinusB() {
        Set<Integer> result = new HashSet<>(setA);
        result.removeAll(setB);
        return result;
    }

    // Method for difference B-A
    public Set<Integer> differenceBMinusA() {
        Set<Integer> result = new HashSet<>(setB);
        result.removeAll(setA);
        return result;
    }

    // Method for symmetric difference
    public Set<Integer> symmetricDifference() {
        Set<Integer> result = new HashSet<>(setA);
        for (Integer element : setB) {
            if (result.contains(element)) {
                result.remove(element);
            } else {
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Set one " + setA + "\n" + "Set two " + setB + "\n";
    }
}