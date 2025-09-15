package File_Reading_Writing;

import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
	public static void main(String[] args) throws IOException {
		// Accept a string

		// attach a file to FileWriter
		FileWriter fw1 = new FileWriter("Names.txt");
		FileWriter fw2 = new FileWriter("Usage.txt");


		// read character wise from string and write
		// into FileWriter
		

		ArrayList<String> babyNames = new ArrayList<String>();
		
		babyNames.add("Noah");
		babyNames.add("Liam");
		babyNames.add("Jacob");
		babyNames.add("William");
		babyNames.add("Mason");
		babyNames.add("Ethan");
		babyNames.add("Michael");
		babyNames.add("Alexander");
		babyNames.add("James");
		
		for (int i = 0; i < babyNames.size(); i++) {
			fw1.write(babyNames.get(i) + "\n");
		}
		
		ArrayList<String> babyNumbers = new ArrayList<String>();
		
		babyNumbers.add("183258");
		babyNumbers.add("173939");
		babyNumbers.add("163197");
		babyNumbers.add("159893");
		babyNumbers.add("157833");
		babyNumbers.add("149051");
		babyNumbers.add("145106");
		babyNumbers.add("142102");
		babyNumbers.add("139624");
		
		for (int i = 0; i < babyNumbers.size(); i++) {
			fw2.write(babyNumbers.get(i) + "\n");
		}
		

		System.out.println("Writing successful");
		// close the file
		fw1.close();
		fw2.close();
	}
}