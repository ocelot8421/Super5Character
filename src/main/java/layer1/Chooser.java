package layer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Choose a random word.
 */
public class Chooser {
    /**
     * Retrieves a random word from the words5.txt.
     * @param wordsTxt path of words%.txt
     * @return a random word.
     */
    public static String retrieveRandomWord(String wordsTxt) {
        List<String> wordsList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(wordsTxt))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String wordCleared = line
                        .substring(line.indexOf("\"") + 1, line.lastIndexOf("\""))
                        .toLowerCase();
                wordsList.add(wordCleared);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordsList.get(new Random().nextInt(wordsList.size()));
    }
}
