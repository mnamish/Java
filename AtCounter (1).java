package AT_CounterProject;

import static java.lang.System.*;

import java.util.Random;

public class AtCounter {
	private String[][] atMat;
	private int rows;
	private int cols;

	public AtCounter(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		atMat = new String[rows][cols];
		Random random = new Random();

		// Pre-defined string for the matrix
//		String list = "@ - @ - - @ - @ @ @\n" 
//				+ "@ @ @ - @ @ - @ - @\n" 
//				+ "- - - - - - - @ @ @\n"
//				+ "- @ @ @ @ @ - @ - @\n" 
//				+ "- @ - @ - @ - @ - @\n" 
//				+ "@ @ @ @ @ @ - @ @ @\n" 
//				+ "- @ - @ - @ - - - @\n"
//				+ "- @ @ @ - @ - - - -\n" 
//				+ "- @ - @ - @ - @ @ @\n" 
//				+ "- @ @ @ @ @ - @ @ @";

		//list = list.replace("\n", " ");

	//	String[] elements = list.split(" ");

		// Load the elements into the matrix
		 
		int randomNumber = random.nextInt(2) + 1;  
		
		int index = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(randomNumber == 1) {
					atMat[i][j] = "@";
				} else {
					atMat[i][j] = "-";
				}
				
				randomNumber = random.nextInt(2) + 1;
				//atMat[i][j] = elements[index];
				//index++;
			}
		}

		// Print the matrix in the desired format
		System.out.println("HERE THE COMPUTER GENERATED MATIRX: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(atMat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}

	public int countAts(int r, int c) {
		if (r < 0 || r >= rows || c < 0 || c >= cols || !atMat[r][c].equals("@")) {
			return 0;
		}

		atMat[r][c] = "#";

		int atCounter = 1;

		atCounter += countAts(r - 1, c);
		atCounter += countAts(r + 1, c);
		atCounter += countAts(r, c - 1);
		atCounter += countAts(r, c + 1);

		return atCounter;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		System.out.println();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sb.append(atMat[i][j] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}