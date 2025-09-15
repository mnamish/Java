import java.util.*;

public class ReverseStack {
	static Stack<String> sentence= new Stack<>();
	
	
	public static void splitSentance(String word) {
		for(int i = 0; i < word.length(); i++) {
			sentence.push(Character.toString(word.charAt(i)));
			//System.out.println(sentance.get(i));
		}
	}
	
	public static void reverseStack() {
		while (!sentence.isEmpty()) { 
            System.out.print(sentence.pop());
        }
	}
	
	
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("What is your sentence");
		String sentance = scanner.nextLine();
		
		splitSentance(sentance);
		reverseStack();
		
		
		

	}

}
