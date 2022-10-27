import java.util.ArrayList;
import java.util.List;

public class WordsChecker {
    String text;
    List<String> words = new ArrayList<>();

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] parts = text.toLowerCase().split("\\P{IsAlphabetic}+");

        for (String value : parts) {
            words.add(value);
        }

        if (words.contains(word.toLowerCase())) {
            return true;
        }
        return false;
    }
}
