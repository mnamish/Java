import java.util.Stack;

public class EvaluatePostfixExpression {

	static Stack<Integer> operandStack = new Stack<>();

	public static void scanExpression(String expression) {
		String[] nums = expression.split(" ");

		for (int i = 0; i < nums.length; i++) {
			String characters = nums[i];

			if (Operator(characters)) {
				int a = operandStack.pop();
				int b = operandStack.pop();
				
			}
		}
	}

	public static boolean Operator(String token) {
		if (token.equals("-") || token.equals("+") || token.equals("*") || token.equals("/")) {
			return true;
		}
		return false;
	}

	public static int solve() {

	}

	public static void main(String[] args) {
		scanExpression("5 3 + 8 2 - *"); 
		scanExpression("2 3 1 * + 9 -"); 

	}

}
