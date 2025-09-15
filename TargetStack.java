import java.util.*;

public class TargetStack {
	 public List<String> buildArray(int[] target, int n) { 
	        Stack<Integer> stack = new Stack<>();
	        List<String> opp = new ArrayList<>();
	        
	        
	        int index = 0;
	        for (int i = 1; i <= n; i++) {
	        	opp.add("Push");
	            stack.push(i);
	           
	            
	            if (target[index] == stack.peek()) {
	                stack.pop();
	                opp.add("Pop");
	                index++;
	            }
	            
	            if (index == target.length) {
	                break;
	            }
	        }
	        
	        return opp;
	    }
	
	public static void main(String[] args) {
		TargetStack obj = new TargetStack();
		
        int[] target1 = {1, 3};
        int n1 = 3;
        System.out.println(obj.buildArray(target1, n1)); 

        int[] target2 = {1, 2, 3};
        int n2 = 3;
        System.out.println(obj.buildArray(target2, n2));  

        int[] target3 = {1, 2};
        int n3 = 4;
        System.out.println(obj.buildArray(target3, n3));  
    }
}


