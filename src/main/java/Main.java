import layer1.Analyzer;
import layer1.Chooser;
import layer1.Questioner;

import java.util.Objects;

public class Main {
    /**
     * @param args i = 0 - length of word
     */
    public static void main(String[] args) {
        String length = args[1];
        System.out.printf("Please, write %s-character word in lowercase.%n", length);
        String chosenWord = Chooser.retrieveRandomWord(args[0]);
        String notValid = "Not valid input. Please, try again.";
        String answer = Questioner.askWord(notValid, length);
        int counter = 0;
        while (!Analyzer.isSame(chosenWord, answer)) {
            counter++;
            int[] data = Analyzer.receiveData(chosenWord, answer);
            System.out.printf("output: %d; %d;%n (attempt: %d)%n", data[0], data[1], counter);
            answer = Questioner.askWord(notValid, length);
            if (answer.equals("xxxxx")) break;
        }
        System.out.print("chosenWord: ");
        System.out.println(chosenWord);
        if (Objects.equals(answer, chosenWord))
            System.out.println("Congratulation. You guessed it :) ");
    }
}
