import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void addPerson(HashMap<String, Long> info) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many people? :  ");
		int amtPeople = scanner.nextInt();

		for (int i = 1; i <= amtPeople; i++) {

			System.out.println(i + ": " + "Input the person's first name ( All Lower Case ): ");
			String personName = scanner.next();

			System.out.println(i + ": " + "Input the phone number: ");
			Long personNumber = scanner.nextLong();

			info.put(personName, personNumber);
			System.out.println(" ");
			System.out.println(info);
			System.out.println(" ");
		}

	}

	public static void removePerson(HashMap<String, Long> info, String personName) {
		if (info.containsKey(personName)) {
			info.remove(personName);
			System.out.println(info);
		} else {
			System.out.println("Person does not exist: ");
		}

	}

	public static void searchPerson(HashMap<String, Long> info, String personName) {
		if (info.containsKey(personName)) {
			System.out.println("Here is " + personName + "'s phone number: ");
			System.out.println(info.get(personName));
		} else {
			System.out.println("Person does not exist: ");
		}
	}

	public static void main(String[] args) {
		HashMap<String, Long> book = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		addPerson(book);

		while (flag == true) {

			flag = true;
			System.out.println(
					"Would you like to add, remove, or search, or do nothing? ( Input: add or remove or search or nothing )  : ");
			String changes = scanner.next();

			if (changes.equals("add")) {
				addPerson(book);

			} else if (changes.equals("remove")) {
				System.out.println("What person would you like to remove? : ");
				String personName = scanner.next();

				removePerson(book, personName);

			} else if (changes.equals("search")) {
				System.out.println("Who would you like to search up : ");
				String personName = scanner.next();

				searchPerson(book, personName);

			} else if (changes.equals("nothing")) {
				System.out.println("Ok!");
				flag = false;

			} else {
				System.out.println("invalid input");
			}
		}

		System.out.println(book);

	}
}
