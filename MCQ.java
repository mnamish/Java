package ReviewMethodsProject;

import java.util.ArrayList;

public class MCQ extends Question {

	public MCQ(ArrayList<String> question, ArrayList<String> choices) {
		super(question, choices);

	}

	public static void main(String[] args) {
		// Question 1
		ArrayList<String> Questions = new ArrayList<>();
		Questions.add("How many elements are in the periodic table? ");

		ArrayList<String> choices = new ArrayList<>();
		choices.add("118"); // correct answer
		choices.add("120");
		choices.add("101");
		choices.add("116");

		// Question 2
		Questions.add("Which planet in the Milky Way is the hottest? ");

		choices.add("Neptune");
		choices.add("Mars");
		choices.add("Venus"); // correct answer
		choices.add("Jupiter");

		// Question 3
		Questions.add("Which planet has the most moons? ");

		choices.add("Neptune");
		choices.add("Saturn"); // correct answer
		choices.add("Mars");
		choices.add("Jupiter");

		// Question 4
		Questions.add("Which planet is closest to the sun?  ");

		choices.add("Mercury"); // correct answer
		choices.add("Earth");
		choices.add("Mars");
		choices.add("Venus");

		// Question 5
		Questions.add("Where is the strongest human muscle located?  ");

		choices.add("Head");
		choices.add("Legs");
		choices.add("Arms");
		choices.add("Jaw"); // correct answer

		// Question 6
		Questions.add("Which is the only body part that is fully grown from birth?  ");

		choices.add("Eyes"); // correct answer
		choices.add("Legs");
		choices.add("Hand");
		choices.add("Feet");

		// Question 7
		Questions.add("How many bones do we have in an ear?  ");

		choices.add("3"); // correct answer
		choices.add("6");
		choices.add("10");
		choices.add("9");

		// Question 8
		Questions.add("What is the process by which plants convert sunlight to energy?  ");

		choices.add("Food");
		choices.add("Energy");
		choices.add("Photosynthesis"); // correct answer
		choices.add("Power");

		// Question 9
		Questions.add("What is the chemical element with the symbol Fe?  ");

		choices.add("Food");
		choices.add("Energy");
		choices.add("Iron"); // correct answer
		choices.add("Power");

		// Question 10
		Questions.add("What is the process by which a liquid changes into a gas?  ");

		choices.add("Steam");
		choices.add("Clouds");
		choices.add("Heat");
		choices.add("Evaporation"); // correct answer

		choices.add(" "); // To fix Out of Bounds error

	}

}