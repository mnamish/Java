import java.util.Stack;

public class balancedParentheses {
	static Stack<String> charStack= new Stack<>();
	
	
	public static void pushBracket(String text) {
		for(int i = 0; i < text.length(); i++) {
			charStack.push(Character.toString(text.charAt(i)));
		}
	}
	
	public static String checkBalance() {
		for(int i = 0; i < charStack.size()+3; i++) {
			
			
			
			if(charStack.get(i).equals(charStack.get(i+1)) && 
			  (charStack.get(charStack.size())).equals(charStack.get(charStack.size()-1))) {
				return "Balanced";
				
			} else if(charStack.get(i).equals(charStack.get(i+3)) && charStack.get(charStack.size()).equals(charStack.get(charStack.size()-3))) {
				return "Balanced";
			
			} else {
				return "UnBalanced";
				
			}
			
		}
		return "Undef";
	}

	public static void main(String[] args) {
		
		pushBracket("(){}");
	}

}
