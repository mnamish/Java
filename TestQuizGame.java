package ReviewMethodsProject;
import java.util.*;

public class TestQuizGame{
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	ArrayList<String> question = new ArrayList<>();
    	question.add("How many elements are in the periodic table? ");

		ArrayList<String> choices = new ArrayList<>();
		choices.add("118"); // correct answer
		choices.add("120");
		choices.add("101");
		choices.add("116");

		// Question 2
		question.add("Which planet in the Milky Way is the hottest? ");

		choices.add("Neptune");
		choices.add("Mars");
		choices.add("Venus"); // correct answer
		choices.add("Jupiter");

		// Question 3
		question.add("Which planet has the most moons? ");

		choices.add("Neptune");
		choices.add("Saturn"); // correct answer
		choices.add("Mars");
		choices.add("Jupiter");

		// Question 4
		question.add("Which planet is closest to the sun?  ");

		choices.add("Mercury"); // correct answer
		choices.add("Earth");
		choices.add("Mars");
		choices.add("Venus");

		// Question 5
		question.add("Where is the strongest human muscle located?  ");

		choices.add("Head");
		choices.add("Legs");
		choices.add("Arms");
		choices.add("Jaw"); // correct answer

		// Question 6
		question.add("Which is the only body part that is fully grown from birth?  ");

		choices.add("Eyes"); // correct answer
		choices.add("Legs");
		choices.add("Hand");
		choices.add("Feet");

		// Question 7
		question.add("How many bones do we have in an ear?  ");

		choices.add("3"); // correct answer
		choices.add("6");
		choices.add("10");
		choices.add("9");

		// Question 8
		question.add("What is the process by which plants convert sunlight to energy?  ");

		choices.add("Food");
		choices.add("Energy");
		choices.add("Photosynthesis"); // correct answer
		choices.add("Power");

		// Question 9
		question.add("What is the chemical element with the symbol Fe?  ");

		choices.add("Food");
		choices.add("Energy");
		choices.add("Iron"); // correct answer
		choices.add("Power");

		// Question 10
		question.add("What is the process by which a liquid changes into a gas?  ");

		choices.add("Steam");
		choices.add("Clouds");
		choices.add("Heat"); 
		choices.add("Evaporation"); // correct answer
		
		choices.add(" "); //To fix Out of Bounds error3
		
		
		MultipleChoiceQuestion quiz = new MultipleChoiceQuestion(question, choices);
		QuizGame qg = new QuizGame();
		
		System.out.println(choices.size());
		
		qg.startGame(quiz);
		
		System.out.println("Would you like you letter grade? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int grade = scanner.nextInt();
		
		if(grade == 1) {
			System.out.println(qg.getScores(quiz)); 
		}	
    }
}