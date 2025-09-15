public class SimpleStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public SimpleStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public int pop() {
    	int value = 0;
    	
      if(isEmpty()) {
    	  System.out.println("Stack is Empty!");
    	  return -1;
      } else {
    	  value = stackArray[top];
    	  top--;
      }
      
      return value;
    }

    public int peek() {
    	int value = 0;
    	
    	 if(isEmpty()) {
    		 System.out.println("Stack is Empty!");
    	 } else {
    		value = stackArray[top];
    	 }
    	 
    	 return value;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
    	return (top == maxSize-1);
        
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);
        
        System.out.println("Empty Stack: ");
        System.out.println();
        
        //To check a Empty Stack
        System.out.println("Peek: " + stack.peek());
        System.out.println("Peek: " + stack.pop());
        
        
        
        System.out.println();
        System.out.println("------");
        System.out.println();
        
        
        
        System.out.println("Full Stack: ");
        System.out.println();
        
        //To check a Full Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        stack.push(30);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
        stack.push(90);
        System.out.println("Peek: " + stack.peek());
        stack.push(5);
        stack.push(4);
        stack.push(6);
        System.out.println("Popped: " + stack.pop());
        stack.push(6);
        System.out.println("Peek: " + stack.peek());
    }
}