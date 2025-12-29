package logic.string;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original: " + input);
        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}
