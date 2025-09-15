package ReviewMethodsProject;

import java.util.*;

public class QuizGame {

	int points = 0;
	int randID = 0;
	int newID = 999;
	
	public QuizGame() {
		
	}
	

	public void startGame(MultipleChoiceQuestion quiz) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		points=0;

		// Introduction
		System.out.println("Welcome to the Quiz Game!");
		System.out.println();
		
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
			
			System.out.println("");
			System.out.println("Question " + (questionIterator + 1) + " of 10: ");
			System.out.println(quiz.getQuestion(questionIterator));
			System.out.println("Enter the Option number");
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

		System.out.println("You got " + points + "/" + "10");

		System.out.println("Would you like to try again? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int reTry = scanner.nextInt();

		if (reTry == 1) {
			System.out.println("rand: " + randID);
			startGame(quiz);
		}
	}

	public String getScores(MultipleChoiceQuestion quiz) {
		double avg;

		if (points != 10) {
			avg = (points % quiz.sizeQuestion()) * 10;
		} else {
			return "A";
		}

		if (avg >= 90.0) {
			System.out.println(avg);
			return "A";
		} else if (avg <= 89.9 && avg >= 80.0) {
			System.out.println(avg + "%");
			return "B";
		} else if (avg <= 79.9 && avg >= 70.0) {
			System.out.println(avg + "%");
			return "C";
		} else if (avg <= 69.9 && avg >= 60.0) {
			System.out.println(avg + "%");
			return "D";
		}
		System.out.println(avg + "%");
		return "F";
	}
}