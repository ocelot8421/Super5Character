package layer1;

import java.util.Objects;

public class Analyzer {
    /**
     * Checks whether the chosen word and the given answer match or not.
     */
    public static boolean isSame(String chosenWord, String answer) {
        return Objects.equals(chosenWord, answer);
    }

    public static int[] receiveData(String chosenWord, String answer) {
        int contain = 0;
        int bingo = 0;
        int[] data = new int[2];
        String[] answerSplit = answer.split("");
        String[] chosenSplit = chosenWord.split("");
        for (int i = 0; i < answerSplit.length; i++) {
            String answerSub = answer.substring(0, i);
            if (chosenWord.contains(answerSplit[i])) {
                if (Objects.equals(chosenSplit[i], answerSplit[i])) bingo++;
                else if (!answerSub.contains(answerSplit[i])) contain++;
            }
        }
        data[0] = bingo;
        data[1] = contain;
        return data;
    }
}
