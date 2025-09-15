import java.util.Scanner;

public class MazeRunner01 {

	
	public static void main(String args[]) {
		char[][] m = { { '*', '*', '*', ' ', '*', '*', '*', '*', '*' }, 
				       { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				       { '*', ' ', '*', '*', '*', '*', '*', ' ', '*' }, 
				       { '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
				       { '*', ' ', '*', '.', '*', '*', '*', ' ', '*' }, 
				       { '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*' },
				       { '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' }, 
				       { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				       { '*', '*', '*', '*', '*', '*', '*', '*', '*' } };
		
		char[][] fail = 
				{  { '*', '*', '*', '*', '*', '*', '*', ' ', '*' },
			       { '*', ' ', '*', '*', '*', '*', '*', ' ', '*' }, 
			       { '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
			       { '*', ' ', '*', '.', '*', '*', '*', ' ', '*' }, 
			       { '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
			       { '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' }, 
			       { '*', ' ', ' ', ' ', '*', ' ', '*', ' ', '*' },
			       { '*', '*', '*', '*', '*', '*', '*', '*', '*' } };
	
		MazeSolver maze = new MazeSolver(m, 4, 3);
		System.out.println("\n\n\n\n\n\n\n");
		maze.display();
		Scanner keyboard = new Scanner(System.in);
		String wait = keyboard.nextLine();
		
		if (maze.findExit())
			System.out.println("\n\n\n\n\n\n\nThere is an exit at (" + maze.getIExit() + ", " + maze.getJExit() + ")");
		else
			System.out.println("No exit was found");

		System.out.println();
		maze.display();
		

	}
}