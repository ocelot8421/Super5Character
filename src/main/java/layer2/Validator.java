package layer2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * The Validator class checks the answer by length and lowercase.
 */
public class Validator {

    /**
     * Checks if the answer is a string of lowercase characters or not.
     *
     * @param answer The answer that we want to valid.
     * @return true if the answer is lowercase.
     */
    public static boolean isLowercase(String answer) {
        IntStream chars = answer.chars();
        List<Boolean> flag = new ArrayList<>();
        chars.forEach(e -> flag.add(Character.isLowerCase(e)));
        return !flag.contains(false);
    }

    /**
     * Checks whether the length of the response string is correct or not.
     * @return  returns true if the word length matches.
     */
    public static boolean isLengthCorrect(String answer, int wordLength) {
        return answer.length() == wordLength;
    }
}
