package logic.string;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
    }
}
