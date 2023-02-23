package layer1;

import layer2.Validator;

import java.util.Scanner;

/**
 * Prompts an answer from the user for a given question.
 */
public class Questioner {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Asks user to give a 5-character word. Aks again if the user does not give a valid answer.
     *
     * @param wordLength        The length of the word.
     * @param repeatingQuestion A question that appears if the user does not write a 5-character word.
     * @return 5-character word.
     */
    public static String returnValidatedAnswer(String repeatingQuestion, String wordLength) {
        System.out.print("input: ");
        String answer = scanner.next();
        boolean isLowercase = Validator.isLowercase(answer);
        int length = Integer.parseInt(wordLength);
        boolean isLength5 = Validator.isLengthCorrect(answer, length);
        while (!isLength5 || !isLowercase) {
            System.out.println(repeatingQuestion);
            answer = scanner.next();
            isLowercase = Validator.isLowercase(answer);
            isLength5 = Validator.isLengthCorrect(answer, length);
        }
        return answer;
    }
}
