import java.io.*;
import java.util.*;

public class tomSawyer2 {
    private Map<String, Integer> wordMap;

    public tomSawyer2(String filename) {
        wordMap = new HashMap<>();
        loadFile(filename);
    }

    private void loadFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().toLowerCase();
                String[] words = line.split(" ");

                for (String word : words) {
                    word = cleanWord(word);
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    // Remove punctuation from beginning and end of word
    private String cleanWord(String word) {
        // Remove punctuation from the beginning
        int start = 0;
        while (start < word.length() && !isAlphaNumeric(word.charAt(start))) {
            start++;
        }

        // Remove punctuation from the end
        int end = word.length() - 1;
        while (end >= start && !isAlphaNumeric(word.charAt(end))) {
            end--;
        }

        if (start <= end) {
            return word.substring(start, end + 1);
        } else {
            return "";
        }
    }

    // Helper method to check if a character is alphanumeric
    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    // 1. Print the entire map
    public void printWordMap() {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // 2. Return a Set of words that appear only once
    public Set<String> getWordsAppearingOnce() {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    // 3. Create a Set of words that appear more than 10 times and print them with counts
    public Set<String> printWordsAppearingMoreThanTen() {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > 10) {
                result.add(entry.getKey());
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        return result;
    }

    public void writeWordMapToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word map written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        tomSawyer2 ts = new tomSawyer2("tomSawyer.txt");

        System.out.println("\n--- Entire Word Map ---");
        ts.writeWordMapToFile("wordMapOutput.txt");

        System.out.println("\n--- Words Appearing Only Once ---");
        Set<String> once = ts.getWordsAppearingOnce();
        System.out.println(once);

        System.out.println("\n--- Words Appearing More Than 10 Times ---");
        Set<String> moreThanTen = ts.printWordsAppearingMoreThanTen();
    }
}