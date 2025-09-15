import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagementSystem {

	public static void addItem(HashMap<String, Integer> info) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much inventory is there going to be in total? :  ");
		int studentNum = scanner.nextInt();

		for (int i = 1; i <= studentNum; i++) {

			System.out.println(i + ": " + "Input item name ( All Lower Case ): ");
			String itemName = scanner.next();

			System.out.println(i + ": " + "Input quantity: ");
			int invenQuantity = scanner.nextInt();

			info.put(itemName, invenQuantity);
			System.out.println(" ");
			System.out.println(info);
			System.out.println(" ");
		}

	}

	public static void removeItem(HashMap<String, Integer> info, String itemName) {
		if (info.containsKey(itemName)) {
			info.remove(itemName);
			System.out.println(info);
		} else {
			System.out.println("Student does not exist: ");
		}

	}

	public static void updateQuantity(HashMap<String, Integer> info, String itemName, int rating) {
		if (info.containsKey(itemName)) {
			info.put(itemName, rating);
		} else {
			System.out.println("Student does not exist: ");
		}
	}

	public static void displayInventory(HashMap<String, Integer> info) {
		System.out.println(info);
	}

	public static void main(String[] args) {
		HashMap<String, Integer> warehouse = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		addItem(warehouse);

		while (flag == true) {

			flag = true;
			System.out.println(
					"Would you like to add, remove, update, display current inventory, or do nothing? ( Input: add or remove or update or display or nothing )  : ");
			String changes = scanner.next();

			if (changes.equals("add")) {
				addItem(warehouse);

			} else if (changes.equals("remove")) {
				System.out.println("What item would you like to remove? : ");
				String remStudent = scanner.next();

				removeItem(warehouse, remStudent);

			} else if (changes.equals("update")) {
				System.out.println("What item would you like to update? : ");
				String nameStudent = scanner.next();

				System.out.println("What is " + nameStudent + " 's new quantity? : ");
				int newGrade = scanner.nextInt();

				updateQuantity(warehouse, nameStudent, newGrade);

			} else if (changes.equals("display")) {
				displayInventory(warehouse);

			} else if (changes.equals("nothing")) {
				System.out.println("Ok!");
				flag = false;

			} else {
				System.out.println("invalid input");
			}
		}
	}
}
