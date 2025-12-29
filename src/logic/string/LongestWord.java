package logic.string;

public class LongestWord {
    public static String findLongestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "Find the longest word in this sentence";
        System.out.println("Longest word: " + findLongestWord(input));
    }
}
