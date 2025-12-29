package logic.string;

public class ReplaceSpaces {
    public static String replaceWithPercent20(String str) {
        return str.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        String input = "Hello World, how are you?";
        System.out.println("Original: " + input);
        System.out.println("After replacement: " + replaceWithPercent20(input));
    }
}
