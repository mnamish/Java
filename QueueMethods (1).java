package LinkedLists;
import java.util.*;

public class QueueMethods {

    // Returns a new queue that is the clone of one.
    public static Queue<String> clone(Queue<String> one) {
        return new LinkedList<>(one);
    }

    // Reverses the queue
    public static Queue<String> reverse(Queue<String> x) {
        Stack<String> stack = new Stack<>();
        while (!x.isEmpty()) {
            stack.push(x.poll());
        }
        while (!stack.isEmpty()) {
            x.offer(stack.pop());
        }
        return x;
    }

    // Alternates elements from two queues
    public static Queue<String> alternate(Queue<String> one, Queue<String> two) {
        Queue<String> result = new LinkedList<>();
        while (!one.isEmpty() || !two.isEmpty()) {
            if (!one.isEmpty()) result.offer(one.poll());
            if (!two.isEmpty()) result.offer(two.poll());
        }
        return result;
    }

    // Appends Queue y to the end of Queue x
    public static Queue<String> append(Queue<String> x, Queue<String> y) {
        x.addAll(y);
        return x;
    }

    // Checks if a queue is a palindrome
    public static boolean isPalindrome(Queue<String> x) {
        List<String> list = new ArrayList<>(x);
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    // Checks if the queue is in alphabetical order
    public static boolean isAlphabetical(Queue<String> x) {
        Iterator<String> iter = x.iterator();
        if (!iter.hasNext()) return true;
        String prev = iter.next();
        while (iter.hasNext()) {
            String curr = iter.next();
            if (prev.compareTo(curr) > 0) return false;
            prev = curr;
        }
        return true;
    }

    // Calculates the average of integers in a queue
    public static double getAverage(Queue<Integer> one) {
        if (one.isEmpty()) return 0;
        int sum = 0, count = 0;
        for (int num : one) {
            sum += num;
            count++;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList("a", "b", "c", "b", "a"));
        System.out.println("Clone: " + clone(q1));
        System.out.println("Reverse: " + reverse(new LinkedList<>(q1)));
        System.out.println("Is Palindrome: " + isPalindrome(q1));
        System.out.println("Is Alphabetical: " + isAlphabetical(q1));
        
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Average: " + getAverage(q2));
    }
}
