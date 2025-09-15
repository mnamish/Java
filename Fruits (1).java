import java.util.LinkedList;
import java.util.ListIterator;

public class Fruits {
	LinkedList<String> bowl;

	//Default constructor. Create the ArrayList with 9 fruits
	public Fruits() {
//		 bowl = new LinkedList();
		bowl = new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		bowl.addLast("watermelon");

	}

	public void displayFruit() {
		//Use LL toString()
		System.out.println(bowl);
	}

	public void displayFruit2() {
		//Use For Each loop
		for (String t : bowl)
			System.out.println(t);
	}

	public void displayFruit3() {
		//Use ListIterator
		ListIterator<String> iterator1 = bowl.listIterator();
		while (iterator1.hasNext())
			System.out.println(iterator1.next());

	}

	public void testIterator() {
		ListIterator<String> tc = bowl.listIterator();
		tc.remove();
	}

	public void displayEveryOtherFruit() {

		ListIterator<String> tc = bowl.listIterator();

		while (tc.hasNext()) {
			System.out.println(tc.next());
			if (tc.hasNext())
				tc.next();
		}
	}

	//This method will remove every other fruit in the list starting with the first one.
	public void removeEveryOtherFruit() {
		ListIterator<String> iter = bowl.listIterator();

		while (iter.hasNext()) {
			iter.next();
			iter.remove();

			if (iter.hasNext())
				iter.next();
		}
	}

	public void displayReverse() {
		ListIterator<String> iter = bowl.listIterator();

		while (iter.hasNext())// moves the iterator as far as it will go
			iter.next();// and now that it is at the "end",

		while (iter.hasPrevious())// we can print the "end" elements until
			System.out.println(iter.previous());// there are no more left
	}

	// 1. Assume the list is in alphabetical order. This method will insert a
	// String newFruit in the correct place in the list
	public void insert(String newFruit) {
	
	}
	
	// 2. Remove all occurrences of fruit beginning with a letter beginningLetter
	// You may use the remove method but should also use an iterator
	public void delete(String firstLett) {
		
	}

	//3. Locate a word (passed as a parameter) in the list – if found ( or not found), return
	//inputWord “is indeed in the list” (or “is not in the list”).
	public String locate(String fruit){
		return null;
	}
	
	//4. Create a new Fruits object holding the reverse of the current list
	//(note: this is quite a bit different from displayReverse()method).
	public Fruits reverseList() {
		return null;
	}
	
	
	
	
	public static void main(String[] args) {
		Fruits one = new Fruits();
		one.displayFruit();

		System.out.println();
		System.out.println("Display Every Other Fruit");
		one.displayEveryOtherFruit();
		System.out.println();
		System.out.println();
		System.out.println("REVERSE");
		one.displayReverse();
		System.out.println();
		System.out.println("After Inserting");
		one.insert("mango");
		one.insert("acai");
		one.insert("melon");
		one.insert("acai");

		one.delete("a");
		one.displayFruit();

		System.out.println();
		System.out.println("REVERSE");
		one.displayReverse();
		System.out.println();

//		System.out.println("After Inserting");
//		one.insert("mango");
//		one.insert("acai");
//		one.insert("yellow apple");
//		one.insert("lime");
//		one.displayFruit();

	}

}
