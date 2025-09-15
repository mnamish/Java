package File_Reading_Writing;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class BabyNameData {
	public static void main(String[] args) {
		// attempts to read from a text file, will throw an error if file does not exist
		try {

			File myObj1 = new File("Names.txt");
			File myObj2 = new File("Usage.txt");
			Scanner myReader1 = new Scanner(myObj1);
			Scanner myReader2 = new Scanner(myObj2);
			ArrayList<String> namesList = new ArrayList<String>();
			ArrayList<String> numbersList = new ArrayList<String>();

			// continues to read through the file as long as there are still lines

			while (myReader2.hasNextLine()) {
				String data1 = myReader1.nextLine();
				String data2 = myReader2.nextLine();

				namesList.add(data1);
				numbersList.add(data2);
			}
			myReader1.close();
			myReader2.close();
			
			String highestFreqName = "";
            String lowestFreqName = "";
            int highestFrequency = 0;
            int lowestFrequency = 0;
            int totalFrequency = 0;
            int namesStartingWithA = 0;

            if (!numbersList.isEmpty()) { 
       
                highestFrequency = Integer.parseInt(numbersList.get(0));
                lowestFrequency = highestFrequency; 
                highestFreqName = namesList.get(0);
                lowestFreqName = namesList.get(0);

			for (int i = 0; i < numbersList.size(); i++) {
				
				int frequency = Integer.parseInt(numbersList.get(i));
				String name = namesList.get(i);

				totalFrequency += frequency;

				//Highest frequency
				if (frequency > highestFrequency) {
					highestFrequency = frequency;
					highestFreqName = name;
				}

				//Lowest frequency
				if (frequency < lowestFrequency) {
					lowestFrequency = frequency;
					lowestFreqName = name;
				}

				// Name starting with the letter A
				if (name.startsWith("A")) {
					namesStartingWithA++;
				}
			}

			// Display results
			System.out.println("The name with the highest frequency: " + highestFreqName + " with " + highestFrequency);
			System.out.println("The name with the lowest frequency: " + lowestFreqName + " with " + lowestFrequency);
			System.out.println("The total of all frequencies: " + totalFrequency);
			System.out.println("The number of names that start with 'A': " + namesStartingWithA);
            }
		}

		// this is the code that runs if the file does not exist
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}