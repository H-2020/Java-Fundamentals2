package higher_lower;

import java.util.Random;

public class RandomizerApp {
    public static void main(String[] args) {

        Random random = new Random();

        for(int index = 0; index < 10_000; index++){

            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100 + 1);

            if(number1 == 100){
                System.out.println("N1 with index " + index + ": " + number1);
            }

            if(number2 == 100){
                System.out.println("N2 with index " + index + ": " + number2);
            }
        }

    }
}
