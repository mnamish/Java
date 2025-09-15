import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class StudentMaps {
	
	public static void input() { 
		
	
	}

	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		LinkedList<String> names = new LinkedList<>();
		
		int i = 1;
		
		while(i <= 4) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Input Student name: ");
			String in = scanner.nextLine();
			names.add(in);
			
			System.out.println("Input Student ID: ");
			int id = scanner.nextInt();
			
			student.put(in, id);	
			i++;
		}
		
		int k = 0;
		while(  k < names.size()) {
			System.out.print(names.get(k) + ": ");
			System.out.println(student.get(names.get(k)));
			k++;
			
		}
		

	}

}
