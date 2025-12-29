package logic.string;

public class CountVowels {
    public static int count(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Number of vowels in '" + input + "': " + count(input));
    }
}
