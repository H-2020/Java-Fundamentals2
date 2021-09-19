package higher_lower;
import java.util.Scanner;

public class HigherAndLowerGameApp {
    public static void main(String[] args) {

        // PRINT -> welcome
        System.out.println("Welcome");

        // CREATE -> game
        HigherAndLowerGame game = new HigherAndLowerGame(100);

        // CREATE -> scanner
        Scanner scanner = new Scanner(System.in);

        boolean isGuessed = false;
        while(!isGuessed){

            // PRINT -> guess a number:
            System.out.print("Guess a number: ");

            // READ(guess_value)
            int guessValue = scanner.nextInt();

            // SCANNER_ISSUE
            scanner.nextLine();

            // PRINT -> guessed value
            System.out.println("Your guess is : " + guessValue);

            // MAKE_A_GUESS
            int guessResult = game.guess(guessValue);

            switch (guessResult){
                case -1:
                    // SMALLER
                    System.out.println("Actual number is greater");
                    break;
                case 1:
                    // GREATER
                    System.out.println("Actual number is smaller");
                    break;
                case 0:
                    // EQUAL
                    System.out.println("Success, guess is correct!");
                    isGuessed = true;
                    break;
            }
        }



        // PRINT -> goodbye
        System.out.println("Goodbye");

    }
}
