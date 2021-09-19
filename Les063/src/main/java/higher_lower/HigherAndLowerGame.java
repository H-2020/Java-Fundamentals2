package higher_lower;
import java.util.Random;
public class HigherAndLowerGame {
    // fields: public
    private int actualValue;
    private int max;

    // memory creates an address.
    private Random random;
    private String message;

    // ClassName(params){  }

    public HigherAndLowerGame(int paramMax) {
        max = paramMax;
        random = new Random();
        reset();
    }

    // methods: public
    public void reset() {
        actualValue = random.nextInt(max + 1);
    }

    int guess(int guessValue) {

        int greaterResponse = 1;
        int smallerResponse = -1;
        int equalsResponse = 0;

        if (guessValue < actualValue) { // if guessed value from user is smaller than actual value..
            return smallerResponse;
        } else if (guessValue > actualValue) { // else if guessed value from user is greater than actual value..
            return greaterResponse;
        } else { // if guessed value from user is equal to actual value..
            return equalsResponse;
        }
    }

}
