public class Priorities {
    public static void main(String[] args) {
        // what is the output?
        // CREATE -> number1, number2
        int number1 = 10;
        int number2 = -10;

        // PRINT -> numbers with incrementation (SAME)
        System.out.println("++number1 v1");
        System.out.println(++number1); // right to left
        System.out.println("recent value of number1 is " + number1);

        number1 = 10;

        // PRINT -> numbers with incrementation (SAME)
        System.out.println("++number1 v2");
        number1 = number1 + 1;
        System.out.println(number1);
        System.out.println("recent value of number1 is " + number1);

        number1 = 10;

        // PRINT -> numbers with incrementation (SAME)
        System.out.println("++number1 v3");
        System.out.println(number1 = number1 + 1);
        System.out.println("recent value of number1 is " + number1);

           /*
           formula for ++number ->  number = (number + 1);
           step 1: instruction 1: (number + 1) -> 11
           step 1: instruction 2: number = 11;
           JVM requires extra space to calculate
           (number + 1);
           step 1: read the value of number1.
           step 2: increment number1.
           step 3: print the value of number1.
         */
        // PRINT -> numbers with decrementing (SAME)
        System.out.println("number2-- v1");
        System.out.println(number2--); // right to left
        System.out.println("recent value of number2 is " + number2);

        number2 = -10;

        // PRINT -> numbers with decrementing (SAME)
        System.out.println("number2-- v2");
        System.out.println(number2);
        number2 = number2 - 1;
        System.out.println("recent value of number2 is " + number2);

        number2 = -10;

        // PRINT -> numbers with decrementing (SAME)
        System.out.println("number2-- v3");
        System.out.println(number2 = number2 - 1);
        System.out.println("recent value of number2 is " + number2);

        /*
            step 1: decrement number2
            step 2: read value from number2
            step 3: print the value of number2
            formula for number2-- -> number = (number - 1);
            step1: instruction 1: (number - 1) -> -11
            step1: instruction 2: number = -11;
         */
        for (int index = 0; index < 10; index = index + 1) {
        }
    }
}