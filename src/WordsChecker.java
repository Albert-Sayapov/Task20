import java.util.ArrayList;
import java.util.List;

public class WordsChecker {
    protected String text;
    protected List<String> words;

    public WordsChecker(String text) {
        this.words = new ArrayList<>();
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] parts = this.text.toLowerCase().split("\\P{IsAlphabetic}+");

        for (String value : parts) {
            this.words.add(value);
        }

        if (this.words.contains(word.toLowerCase())) {
            return true;
        }
        return false;
    }
}
