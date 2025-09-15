package Stacks;

public class StackInsertAtEnd {
	private Node head = null;
	private Node tail = null;
	private Node bottom = null;
	private int length = 0;

	private static class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int v, Node n) {
			value = v;
			next = n;
		}
	}

	public void push(int value) {
		Node newNode = new Node(value, null);
		if (length == 0) {
			head = tail = bottom = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public int pop() throws IllegalStateException {
		if (length == 0) {
			throw new IllegalStateException("StackEmptyException");
		}
		int value = tail.value;
		tail = tail.next;
		length--;
		return value;
	}

	public int removeBottom() throws IllegalStateException {
		if (length == 0) {
			throw new IllegalStateException("StackEmptyException");
		}
		int value = bottom.value;
		if (length == 1) {
			head = tail = bottom = null;
		} else {
			head = head.next;
			bottom = bottom.next;
		}
		length--;
		return value;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackInsertAtEnd s = new StackInsertAtEnd();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.print("Origanal Stack ");
		s.print();

		System.out.print("Removed bottom: " + s.removeBottom() + "\n");
		System.out.print("Stack: ");
		s.print();

	}

}
