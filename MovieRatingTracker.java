import java.util.*;

public class MovieRatingTracker {

	public static void addMovie(HashMap<String, Integer> info) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many movies are you going to add? :  ");
		int studentNum = scanner.nextInt();

		for (int i = 1; i <= studentNum; i++) {

			System.out.println(i + ": " + "Input the movie's name ( All Lower Case ): ");
			String movieName = scanner.next();

			System.out.println(i + ": " + "Input rating (1-5): ");
			int rating = scanner.nextInt(6);

			info.put(movieName, rating);
			System.out.println(" ");
			System.out.println(info);
			System.out.println(" ");
		}

	}

	public static void updateRating(HashMap<String, Integer> info, String movieName, int rating) {
		if (info.containsKey(movieName)) {
			info.put(movieName, rating);
		} else {
			System.out.println("Movie does not exist: ");
		}
	}

	public static void avgRating(HashMap<String, Integer> info) {
		double addRating = 0.0;
		for (String key : info.keySet()) {
			addRating += info.get(key);
		}

		System.out.println(addRating / info.size());
	}

	public static void main(String[] args) {
		HashMap<String, Integer> movieReviews = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		addMovie(movieReviews);

		while (flag == true) {

			flag = true;
			System.out.println(
					"Would you like to add, update review , find avg rating, or do nothing? ( Input: add or update or average or nothing )  : ");
			String changes = scanner.next();

			if (changes.equals("add")) {
				addMovie(movieReviews);

			} else if (changes.equals("update")) {
				System.out.println("What movie would you like to update? : ");
				String movieName = scanner.next();

				System.out.println("What is " + movieName + " 's new rating? : ");
				int newRating = scanner.nextInt();

				updateRating(movieReviews, movieName, newRating);

			} else if (changes.equals("average")) {
				avgRating(movieReviews);

			} else if (changes.equals("nothing")) {
				System.out.println("Ok!");
				flag = false;

			} else {
				System.out.println("invalid input");
			}
		}

		System.out.println(movieReviews);

	}
}