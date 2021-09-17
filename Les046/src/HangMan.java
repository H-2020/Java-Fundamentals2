import java.util.Scanner;

public class HangMan {

    public static void main(String[] args) {
        // HANGMAN
        // | _ _ _ _ _ (intec)
        // | e
        // | _ _ _ e _
        // | i
        // | i _ _ e _
        // | ixtek
        // | WRONG!
        // | intec
        // | CORRECT!
        // PRINT -> Welcome
        System.out.println("Welcome to Hangman Game!");



        // CREATE_PRE_DEFINED_WORD
        String word = "intec";
        char[] wordArray = word.toCharArray();
        int wordLength = wordArray.length;

        String result = "";

        //  _ _ _ _ _
        for (int charIndex = 0; charIndex < wordLength; charIndex++) {
            result += " " + "_";
        }

        System.out.println(result);

        System.out.println();

        // INPUT(guess)
        Scanner scanner = new Scanner(System.in);
        // PRINT -> enter_guess
        System.out.println("Please enter your guess: ");


        // WHILE -> infinite_loop
        while (true) { /* start while loop */
            // INPUT(guess)
            String guess = scanner.nextLine();

            result = "";
            // IF(empty)
            if (guess.isEmpty()) {  /* start if */
                // BREAK -> while_loop
                System.out.println("You have stopped guessing ..");
                break;
            }  /* end if */
            // ELSE(guess_is_not_empty)
            else {  /* start else */
                // PRINT -> enter_guess
                System.out.println("Please enter your guess: ");

                // CONTINUE -> scanning letters
                // FOR(WORD_LENGTH)
                for (int charIndex = 0; charIndex < wordLength; charIndex++) {  /* start for loop */
                    // IF(word_contains_guessed_char)
                    result += " ";
                    if (wordArray[charIndex] == guess.charAt(0)) {
                        // PRINT(found_chars_in_word)
                        result += wordArray[charIndex];
                    } else {
                        // PRINT(not_found_only_underscore)
                        result += "_";
                    }

                }  /* end for loop */
            }  /* end else */
        }  /* end while loop */
        System.out.println(result);


        /*
        // IF(guess_equals_to_word)
        if (guess.equalsIgnoreCase(word)) {
            // PRINT -> correct
            System.out.println("CORRECT! You saved the hangmans ...");
        } else {
            // PRINT -> wrong
            System.out.println("WRONG! Keep trying.. ");
        }
         */
        System.out.println();

        // PRINT -> Goodbye
        System.out.println("Goodbye");
    }

}
