package logic.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Character frequencies in '" + input + "':");
        getCharacterFrequency(input).forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
