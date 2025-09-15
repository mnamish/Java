package FileReading;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class FileAnalysis {

    public static void analyze(String text) {
        String lower = text.toLowerCase();

        // a) tokenize words
        List<String> words = new ArrayList<>();
        Matcher m = Pattern.compile(" ").matcher(lower);
        while (m.find()) words.add(m.group());
        int totalWords = words.size();

        // b) unique words
        Set<String> unique = new HashSet<>(words);
        int uniqueCount = unique.size();

        // c) alphabetical list
        List<String> alpha = new ArrayList<>(unique);
        Collections.sort(alpha);

        // d) top 30 frequent
        Map<String,Integer> freq = new HashMap<>();
        for (String w : words) freq.put(w, freq.getOrDefault(w,0)+1);
        List<Map.Entry<String,Integer>> freqlist = new ArrayList<>(freq.entrySet());
        freqlist.sort((a,b)->b.getValue().compareTo(a.getValue()));
        List<Map.Entry<String,Integer>> top30 = freqlist.subList(0, Math.min(30, freqlist.size()));

        // e) wwords by length
        Map<Integer, List<String>> byLen = new TreeMap<>();
        for (String w : unique) {
            byLen.computeIfAbsent(w.length(), k->new ArrayList<>()).add(w);
        }
        byLen.values().forEach(Collections::sort);

        // f) longest words
        int maxLen = byLen.keySet().stream().mapToInt(i->i).max().orElse(0);
        List<String> longest = byLen.get(maxLen);

        // readability stats
        String[] sentences = text.split("[\\.\\!\\?\\:\\;]");
        int sentenceCount = 0;
        for (String s : sentences) if (s.trim().length()>0) sentenceCount++;

        int totalSyllables = words.stream().mapToInt(FileAnalysis::countSyllables).sum();

        double ASL = (double) totalWords / sentenceCount;
        double ASW = (double) totalSyllables / totalWords;
        double GLRA = 0.39 * ASL + 11.8 * ASW - 15.59;

        // output
        System.out.println("a) Total words: " + totalWords);
        System.out.println("b) Unique words: " + uniqueCount);
        System.out.println("c) Alphabetical words: " + alpha);
        System.out.println("d) Top 30 words:");
        top30.forEach(e -> System.out.printf("   %s : %d%n", e.getKey(), e.getValue()));
        System.out.println("e) Words by length:");
        for (var entry : byLen.entrySet()) {
            System.out.println("   " + entry.getKey() + "-letter words: " + entry.getValue());
        }
        System.out.println("f) Longest words (length " + maxLen + "): " + longest);
        System.out.printf("g) Misspelled words: (TODO)%n");
        System.out.printf("h) Readability (Grade Level) = %.2f%n", GLRA);
    }

    static int countSyllables(String word) {
        word = word.toLowerCase();
        Matcher vm = Pattern.compile("[aeiouy]+").matcher(word);
        List<String> vowelGroups = new ArrayList<>();
        while (vm.find()) vowelGroups.add(vm.group());
        if (word.endsWith("e") && vowelGroups.size() > 1) {
            vowelGroups.remove(vowelGroups.size() - 1);
        }
        return Math.max(1, vowelGroups.size());
    }

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("dreams.txt")));
        analyze(text);
    }
}

