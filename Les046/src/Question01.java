import java.util.Scanner;

public class Question01 {

    public static void main(String args[]) {

        // SEPARATOR
        String SEPARATOR = "---------------------------------------------";

        char A = 'A'; // 65
        char Z = 'Z'; // 90
        System.out.println(Integer.valueOf(A));
        System.out.println(Integer.valueOf(Z));

        System.out.println(SEPARATOR);

        String hello = "Hello";

        // char A = 'A' -> 65
        // String hello = "Hello" -> 'H' -> 72, 'e' -> 101, 'l' -> 108, 'l' -> 108, 'o' -> 111
        char[] helloArray = hello.toCharArray();
        int charCounter = 0;
        for (int cIndex = 0; cIndex < helloArray.length; cIndex++) {
            if (helloArray[cIndex] == 'l') {
                charCounter++;
            }
            System.out.println(helloArray[cIndex]);
        }

        System.out.println("There are " + charCounter + " l " + " in your text..");

        System.out.println(SEPARATOR);

        // WHAT IS THE OUTPUT?
        for (char cIndex = 65; cIndex <= 90; cIndex++) {
            System.out.println(cIndex);
        }

        System.out.println(SEPARATOR);

        char[] wordAsCharArray = {
                'f', 'o', 'o', 'd', 'a'
        };
        String wordAsString = "fooda";
        char[] wordAsCharArrayFromString = wordAsString.toCharArray();

        for (int charIndex = 0; charIndex < wordAsCharArray.length; charIndex++) {
            System.out.println(wordAsCharArray[charIndex]);
        }

        System.out.println(SEPARATOR);

        for (int charIndex = 0; charIndex < wordAsCharArrayFromString.length; charIndex++) {
            System.out.println(wordAsCharArrayFromString[charIndex]);
        }

        System.out.println(SEPARATOR);

        // HANGMAN
        // PRINT -> Welcome
        System.out.println("Welcome to Hangman Game!");

        // PRINT -> enter_guess
        System.out.println("Please enter your guess: ");

        // CREATE_PRE_DEFINED_WORD
        String word = "intec";
        char[] wordArray = word.toCharArray();
        int wordLength = wordArray.length;

        //  _ _ _ _ _
        for (int charIndex = 0; charIndex < wordLength; charIndex++) {
            System.out.print(" " + "_");
        }

        System.out.println();

        // INPUT(guess)
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        // _ _ _ _ _
        //e
        // _ _ _ e _

        //FOR(WORD_LENGTH)
        for (int charIndex = 0; charIndex < wordLength; charIndex++) {
            //IF(word_contains-guessed_char)
            if(wordArray[charIndex] == guess.charAt(0)) {
                //PRINT(found_chars_in_word)
                System.out.print(wordArray[charIndex]);
            }
            else{
                //PRINT(not_found_only_underscore)
                System.out.print("_");
            }
        }


        // IF(guess_equals_to_word)
        /*if (guess.equalsIgnoreCase(word)) {
            // PRINT -> correct
            System.out.println("CORRECT! You saved the hangmans ...");
        } else {
            // PRINT -> wrong
            System.out.println("WRONG! Keep trying.. ");
        }*/

        // PRINT -> Goodbye
        System.out.println();
        System.out.println("Goodbye");
    }

}