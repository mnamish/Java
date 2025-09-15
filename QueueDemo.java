import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String args[]) {
		Queue<Integer> queue;
		queue = new LinkedList<Integer>();
		
		//Note that add places items at the end of the array output
		queue.add(11);
		queue.add(7);
		System.out.println(queue);
		System.out.println(queue.peek());
		
		//Remove not pop, note that you can use a print statement to display what is removed
		System.out.println(queue.remove());
		
		//Peek displays the element at front, the next one to be removed
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);
		
		//How do I empty the queue?
		
		
		//How do I access an element that is not in front?

	}
	
}
