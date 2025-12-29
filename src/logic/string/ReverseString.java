package logic.string;

public class ReverseString {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
