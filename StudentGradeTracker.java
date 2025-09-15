import java.util.*;

public class StudentGradeTracker {

	public static void addStudent(HashMap<String, Double> info) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students? :  ");
		int studentNum = scanner.nextInt();

		for (int i = 1; i <= studentNum; i++) {

			System.out.println(i + ": " + "Input the student's first name ( All Lower Case ): ");
			String studentName = scanner.next();

			System.out.println(i + ": " + "Input the student's grade in decimal format: ");
			double studentGrade = scanner.nextDouble();

			info.put(studentName, studentGrade);
			System.out.println(" ");
			System.out.println(info);
			System.out.println(" ");
		}

	}

	public static void removeStudent(HashMap<String, Double> info, String studentName) {
		if (info.containsKey(studentName)) {
			info.remove(studentName);
			System.out.println(info);
		} else {
			System.out.println("Student does not exist: ");
		}

	}

	public static void updateStudent(HashMap<String, Double> info, String studentName, double grade) {
		if (info.containsKey(studentName)) {
			info.put(studentName, grade);
			System.out.println(info);
		} else {
			System.out.println("Student does not exist: ");
		}
	}

	public static void avgGrade(HashMap<String, Double> info) {
		double addNum = 0.0;
		for (String key : info.keySet()) {
			addNum += info.get(key);
		}

		System.out.println(addNum / info.size());
	}

	public static void main(String[] args) {
		HashMap<String, Double> studentInfo = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		addStudent(studentInfo);

		while (flag == true) {

			flag = true;
			System.out.println(
					"Would you like to add, remove, update, find avg grade, or do nothing? ( Input: add or remove or update or average or nothing )  : ");
			String changes = scanner.next();

			if (changes.equals("add")) {
				addStudent(studentInfo);

			} else if (changes.equals("remove")) {
				System.out.println("What student would you like to remove? : ");
				String remStudent = scanner.next();

				removeStudent(studentInfo, remStudent);

			} else if (changes.equals("update")) {
				System.out.println("What student would you like to update? : ");
				String nameStudent = scanner.next();

				System.out.println("What is " + nameStudent + " 's new grade? : ");
				double newGrade = scanner.nextDouble();

				updateStudent(studentInfo, nameStudent, newGrade);

			} else if (changes.equals("average")) {
				avgGrade(studentInfo);

			} else if (changes.equals("nothing")) {
				System.out.println("Ok!");
				flag = false;

			} else {
				System.out.println("invalid input");
			}
		}

		System.out.println(studentInfo);

	}
}