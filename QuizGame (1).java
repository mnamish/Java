package ReviewMethodsProject;

import java.util.*;

public class QuizGame extends Question {
	int points = 0;
	int randID = 0;
	int newID = 999;

	public QuizGame(ArrayList<String> question, ArrayList<String> choices) {
		super(question, choices, 0, 0);

	}

	public void runGame(QuizGame quiz) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Introduction
		System.out.println("Welcome to the Quiz Game!");
		System.out.println();
		System.out.println();

		// Login
		System.out.println("Do you already have a game ID? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("Enter the Option: ");
		int setup = scanner.nextInt();

		// Enter IDs
		if (setup == 1) {
			System.out.println("Please enter your game ID");
			System.out.println("1. Forgot ID");
			int idInput = scanner.nextInt();

			// If User forgot their ID Number
			if (idInput == 1) {
				randID = random.nextInt(1000, 2000);
				setHint(randID % 100);
				System.out.println("Your ID is: " + randID);
				System.out.println("Please enter your game ID");
				newID = scanner.nextInt();

			}

			// Validating ID
			if (idInput == randID && newID == randID) {
				System.out.println();
			} else {
				System.out.println(" The ID Incorrect!");
				System.out.println("You have 1 more tries");
				System.out.println("Would you like a hint? ");
				System.out.println("1. Yes");
				System.out.println("2. No");
				int wantHint = scanner.nextInt();

				// If user wants password hint
				if (wantHint == 1) {
					System.out.println("Your Hint is: " + getHint());

				}

				newID = 0;
				System.out.println("Please enter your game ID");
				newID = scanner.nextInt();

				if (newID == randID && newID == randID) {
					System.out.println();
					System.out.println("Your Game ID is correct");
				} else {
					System.out.println(" The ID Incorrect!");
					System.out.println("You have no more tries! \n You must restart the game.");
					System.exit(wantHint);
				}

			}

		} else { // idInput == 1
			randID = random.nextInt(1000, 2000);
			setID(randID);
			setHint(randID % 100);
			System.out.println("Your ID is: " + randID);
			System.out.println("Please enter your game ID");
			newID = scanner.nextInt();

			System.out.println("rand: " + randID);

			if (newID == randID) {
				System.out.println();
			} else {
				System.out.println(" The ID Incorrect!");
				System.out.println("You have no more tries! \n You must restart the game.");
				System.exit(setup);
			}
		}

		// ACTUAL GAME STARTS HERE:
		int input = 0;
		int iterator = 0;
		int questionIterator = 0;

		System.out.println();
		System.out.println(
				"Here we go! you have 10 questions to complete \n" + "After the quiz you will be graded \n" + "");

		System.out.println("ENTER OPTION NUMBER!!!");
		System.out.println();

		for (int i = 0; i < quiz.choicesSize() || questionIterator != 10; i = i + 4) {

			System.out.println("Question " + (questionIterator + 1) + " of 10: ");
			System.out.println(quiz.getQuestion(questionIterator));
			System.out.println();
			System.out.println("1. " + quiz.getChoices(i));
			System.out.println("2. " + quiz.getChoices(i + 1));
			System.out.println("3. " + quiz.getChoices(i + 2));
			System.out.println("4. " + quiz.getChoices(i + 3));

			input = scanner.nextInt();

			if (questionIterator == 0) {
				if (input == 1) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}

			} else if (questionIterator == 1) {
				if (input == 3) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}

			} else if (questionIterator == 2) {
				if (input == 2) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 3) {
				if (input == 1) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 4) {
				if (input == 4) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 5) {
				if (input == 1) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 6) {
				if (input == 1) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 7) {
				if (input == 3) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 8) {
				if (input == 3) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else if (questionIterator == 9) {
				if (input == 4) {
					System.out.println("Correct!");
					points++;
				} else if (input > 4 || input < 1) {
					System.out.println("Invalid input!");
					System.out.println("You got the question automatically wrong!");
				} else {
					System.out.println("Incorrect!");
				}
			} else {
				System.out.println("Out of bounds");
			}

			if ((questionIterator + 1) == 10) {
				break;
			}

			questionIterator++;
		}

		System.out.println("You got " + points + "/" + quiz.questionSize());

		System.out.println("Would you like to try again? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int reTry = scanner.nextInt();

		if (reTry == 1) {
			System.out.println("rand: " + randID);
			runGame(quiz);
		}
	}

	public String avgScore(QuizGame quiz) {
		double avg;

		if (points != 10) {
			avg = (points % quiz.questionSize()) * 10;
		} else {
			return "A";
		}

		if (avg >= 90.0) {
			return "A";
		} else if (avg <= 89.9 && avg >= 80.0) {
			return "B";
		} else if (avg <= 79.9 && avg >= 70.0) {
			return "C";
		} else if (avg <= 69.9 && avg >= 60.0) {
			return "D";
		}

		return "F";
	}

}