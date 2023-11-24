import java.util.ArrayList;

public class Dictionary {
    public static ArrayList<Word> words = new ArrayList();

    public static ArrayList<String> SaveHistoryWord = new ArrayList();

    public static int NumberOfHistory = 0;

    public ArrayList<Word> getWords() {
        return words;
    }

    public ArrayList<String> getSaveHistoryWord() {
        return SaveHistoryWord;

    }

}
