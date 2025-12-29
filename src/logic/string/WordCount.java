package logic.string;

public class WordCount {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "This is a sample sentence.";
        System.out.println("Number of words: " + countWords(input));
    }
}
