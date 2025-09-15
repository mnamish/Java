package ReviewMethodsProject;

import java.util.*;

public class TestQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//MCQ questions = new MCQ()
		int points = 0;
		String hintYN;

	
		//QuizGame quiz = new QuizGame(Questions, choices);
		MCQ ques = new MCQ(Questions, choices);
		
		ques.runGame(ques);
		
		System.out.println("Would you like you letter grade? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int grade = scanner.nextInt();
		
		if(grade == 1) {
			System.out.println(quiz.avgScore(quiz)); 
		}
		
		

	}

	

}