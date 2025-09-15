public class MazeRunner02 {

	
	public static void main(String args[]) {
		char[][] m = { { '*', '*', '*', ' ', '*', '*', '*', '*', '*' }, 
				       { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				       { '*', ' ', '*', '*', '*', '*', '*', ' ', '*' }, 
				       { '*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*' },
				       { '*', ' ', '*', '?', '*', '*', '*', ' ', '*' }, 
				       { '*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*' },
				       { '*', '*', '*', ' ', '*', ' ', '*', ' ', '*' }, 
				       { '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*' },
				       { '*', '*', '*', '*', '*', '*', '*', '*', '*' } };

		MazeSolver maze = new MazeSolver(m, 4, 3);
		maze.display();
		System.out.println();
		if (maze.findExit())
			System.out.println("There is an exit at (" + maze.getIExit() + ", " + maze.getJExit() + ")");
		else
			System.out.println("No exit was found");

		/*
		System.out.println();
		System.out.println();
		maze.display();
		System.out.println("Steps:" + maze.getSteps());
		*/
	}
}