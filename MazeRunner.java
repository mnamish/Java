package ReviewMethodsProject;

import java.util.*;

public class MazeRunner {
	private char mazeBoard[][];
	private int startingRow;
	private int startingCol;
	private int rows;
    private int cols;
	
	
	
	
	public MazeRunner(char mazeBoard[][], int startingRow, int startingCol) {
        this.rows = mazeBoard.length;
        this.cols = mazeBoard[0].length; 
        this.mazeBoard = new char[rows][cols];

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.mazeBoard[i][j] = mazeBoard[i][j];
            }
        }

        this.startingRow = startingRow;
        this.startingCol = startingCol;
        
        
        System.out.println("Maze: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	System.out.print(mazeBoard[i][j] + " ");
            }
            System.out.println();
        }
        
    }
	
	public boolean escapeMaze(int r, int c) {
		 if (r < 0 || r >= rows || c < 0 || c >= cols) {
	            return false; 
	        }
		 
		 if (mazeBoard[r][c] == '*' || mazeBoard[r][c] == '#') {
	            return false; 
	        }
		 
		 if ((r == 0 || r == mazeBoard.length - 1 || c == 0 || c == mazeBoard[0].length - 1) && mazeBoard[r][c] == ' ') {	 
	            return true;
	     }
		 
		 mazeBoard[r][c] = '#';
		 
		 
		 
		 if (escapeMaze(r - 1, c) || escapeMaze(r + 1, c) || escapeMaze(r, c - 1) || escapeMaze(r, c + 1)) {
	            return true;
	     }
		
		 
		 mazeBoard[r][c] = ' ';
		 mazeBoard[r][c] = '#';
		 
		 return false;
		 
		 
	}


	
	public static void main(String[] args) {
	    char[][] maze = {
	            {'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
	            {'*', ' ', ' ', ' ', '*', ' ', '*', ' ', '*'},
	            {'*', ' ', '*', '*', '*', ' ', '*', ' ', '*'},
	            {'*', ' ', '*', ' ', '*', ' ', ' ',' ', '*'},
	            {'*', ' ', '*', '.', '*', ' ', '*',' ', '*'},
	            {'*', ' ', ' ', ' ', ' ', ' ', '*',' ', '*'},
	            {'*', '*', '*', ' ', '*', '*', '*',' ', '*'},
	            {'*', ' ', ' ', ' ', '*', '*', '*',' ', '*'},
	            {'*', '*', '*', '*', '*', '*', '*','*', '*'}
	    };
	    
	    MazeRunner runner = new MazeRunner(maze, 4, 3);
	    
        boolean canEscape = runner.escapeMaze(4, 3);
        
        if (canEscape == true) {
            System.out.println("Escaped the maze!");
            
        } else {
            System.out.println("No escape found.");
            System.out.println("All exists Blocked!");
        }
	    
		
	    
	}

}