package javabasics.lesson3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Lukomorye {

    @Test
    public void printPoem() {
        System.out.println("У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;");
    }

    @Test
    public void printLearnTogether() {
        String word1 = "Всем";
        String word2 = "привет!";
        String word3 = "Давайте";
        String word4 = "учиться";
        String word5 = "вместе!";

        System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5);
    }

    @Test
    public void countCharacters() {
        String textToCount = "Текст (от лат. textus — ткань; сплетение, сочетание) — зафиксированная на каком-либо материальном носителе человеческая мысль;";

        System.out.println(textToCount.length());

    }

    @Test
    public void countUniqueWords() {
        String textToCount = "Текст (от лат. textus — ткань; сплетение, сочетание) — зафиксированная на каком-либо материальном носителе человеческая мысль;";

        String[] words = textToCount.split("\\s+|\\.|\\,|\\—|\\(|\\;|\\)");

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println("Количество уникальных слов: " + uniqueWords.size());
    }
}
