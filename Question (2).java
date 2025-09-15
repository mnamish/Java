package ReviewMethodsProject;

import java.util.ArrayList;

public class Question {
    private ArrayList<String>  question;
    private ArrayList<String> choices;

    public Question(ArrayList<String> question, ArrayList<String> choices) {
        this.question = question;
        this.choices = choices;
    }

    public String getQuestion(int index) {
        return question.get(index);
    }
    
    public int sizeQuestion() {
        return question.size();
    }

    public String getChoices(int index) {
        return choices.get(index);
    }

    public int choicesSize() {
        return choices.size();
    }
}
