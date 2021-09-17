import java.util.Scanner;

public class Scrabble {

    public static void main(String[] args) {

        // CREATE_ARRAY_ALPHABET
        char[] alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        // CREATE_ARRAY_POINTS
        int[] scores = {
                1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10
        };

        if (alphabet.length != scores.length) {
            System.err.println("Alphabet length is not equal to scores length!");
            System.exit(-1);
        }

        // PRINT -> enter a word
        System.out.println("Please enter a word");

        // INPUT(word)
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] characters = word.toCharArray();

        int totalScore = 0;
        for (int charIndex = 0; charIndex < characters.length; charIndex++) {
            if (Character.isAlphabetic(characters[charIndex])) {
                int charScore = scores[charIndex];
                totalScore += charScore;
            }
        }

        System.out.println("Score: " + totalScore);


    }
}
