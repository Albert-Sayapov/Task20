import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip" +
            " ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate" +
            " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
            "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);
            int value = 0;
            if (Character.isLetter(letter)) {
                if (!map.containsKey(letter)) {
                    value = 1;
                    map.put(letter, value);
                } else {
                    value = map.get(letter);
                    value++;
                    map.put(letter, value);
                }
            }
        }
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int amount : map.values()) {
            if (amount > max) {
                max = amount;
            } else if (amount < min) {
                min = amount;
            }
        }
        System.out.println(max + " " + min);

        WordsChecker wordsChecker = new WordsChecker(text);
        System.out.println(wordsChecker.hasWord("incididunt"));
        System.out.println(wordsChecker.hasWord("incididun"));
    }

}




