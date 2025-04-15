package lab10.Exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of(
                "appple",
                "banana",
                "cherry",
                "avocado",
                "blueberry",
                "grape",
                "plum",
                "apricot"
        );

        char c = 'a';
        char d = 'b';

        System.out.println(countWords(words, c, d, 6));
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return words
                .stream()
                .filter(w -> w.length() == len && w.contains(Character.toString(c)) && !w.contains(Character.toString(d)))
                .toList()
                .size();
    }
}
