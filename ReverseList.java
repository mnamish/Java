import java.util.LinkedList;

public class ReverseList {

	public static void reverse(LinkedList<String> strings) {
		int counter = 0;
		int ReverseIndex = (strings.size() - 1);
		String keep;

		while (counter < strings.size() - 2) {
			keep = strings.get(counter);

			strings.set(counter, strings.get(ReverseIndex));
			strings.set(ReverseIndex, keep);

			counter++;
			ReverseIndex--;
		}
		System.out.println(strings);
	}

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();

		names.add("Namish");
		names.add("Daksh");
		names.add("Dad");
		names.add("Mom");

		reverse(names);

	}

}
