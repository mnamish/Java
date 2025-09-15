import java.util.*;

public class WordSynonymDictionary {
	Set<String> listSyn = new HashSet<>();

	public static void addWords(Map<String, Set<String>> dict) {
		Scanner scanner = new Scanner(System.in);
		Set<String> listSyn = new HashSet<>();
		//listSyn.clear();
		
		System.out.println("What word whould you like to add? : ");
		String word = scanner.next();

		System.out.println("How many synonyms are you going to add? : ");
		int numSyn = scanner.nextInt();

		for (int i = 1; i <= numSyn; i++) {
			System.out.println(i + ". Enter synonym: ");
			String synonym = scanner.next();
			listSyn.add(synonym);
		}

		dict.put(word, listSyn);

		System.out.println("Here is your list: " + dict);
	}

	public static void searchSynonym(Map<String, Set<String>> dict) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What word would you like to search for? : ");
		String wordSerach = scanner.next();
		
		System.out.println(dict.get(wordSerach));
	
	}
	
	public static void addSynonym(Map<String, Set<String>> dict) {
		Scanner scanner = new Scanner(System.in);
		Set<String> listSyn = new HashSet<>();
		
		System.out.println("What is the word you would like to add synonms to? : ");
		String searchWord = scanner.next();
		
		System.out.println("How many total synonyms is the word going to have after you add the new synonyms?  : ");
		int numSyn = scanner.nextInt();
		
		System.out.println("You will have to add the previous and old synonyms again: ");

		for (int i = 1; i <= numSyn; i++) {
			System.out.println(i + ". Enter synonym: ");
			String synonym = scanner.next();
			listSyn.add(synonym);
		}

		dict.put(searchWord, listSyn);
		System.out.println(dict.get(searchWord));
		
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Set<String>> synonymDictionary = new HashMap<>();
		
		addWords(synonymDictionary);
		addWords(synonymDictionary);
		searchSynonym(synonymDictionary);
		addSynonym(synonymDictionary);

	}
}