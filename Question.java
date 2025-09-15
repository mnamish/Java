package ReviewMethodsProject;

import java.util.*;

public class Question {
	private ArrayList<String> question = new ArrayList<>();
	private ArrayList<String> choices = new ArrayList<>();

	public Question(ArrayList<String> question, ArrayList<String> choices) {
		super(playerID, idHint);
		
		this.question = question;
		this.choices = choices;
	}
	
	public String getQuestion(int index) {
		return question.get(index);
	}
	
	public int questionSize() {
		return question.size();
		
	}

	public String getChoices(int index) {
		return choices.get(index);
	}
	
	public int choicesSize() {
		return choices.size();
	}
}
Question.java
Displaying Question.java.Next 