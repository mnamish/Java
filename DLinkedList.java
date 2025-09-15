import java.util.NoSuchElementException;


public class DLinkedList<E>  implements DoubleList<E>{
	private DListNode firstNode;
	private DListNode lastNode;

	/**
	 * Construct an empty list
	 */
	public DLinkedList() {
		firstNode = null;
		lastNode = null;
	}

	}