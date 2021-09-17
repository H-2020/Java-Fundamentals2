import java.util.Scanner;

public class SimpleCalculator {

    // return type -> void (no return value)
    // method name -> main
    // parameters -> String[] args
    public static void main(String[] args) {

        // OP01: Read 5 numbers from user input and
        // print num1 + num2 + num3 + num4 + num5
        // print num1 - num2 + num3 / num4 * num5
        // print average of num1, num2, num3, num4, and num5
        // print average of num1, num2, num3, num4
        // print average of num1, num2, num3
        // print average of num1, num2
        // print average of num1, num3, num4
        // print average of num3, num4, and num5


        // PRINT
        System.out.println("Welcome");

        // PRINT -> entries
        System.out.println("Please enter 5 numbers");

        // CREATE_NUMBERS
        double[] numbers = new double[5];

        // INPUT(numbers)
        Scanner scanner = new Scanner(System.in);
        for (int numberIndex = 0; numberIndex < 5; numberIndex++) {
            numbers[numberIndex] = scanner.nextDouble();
            System.out.println(numbers[numberIndex]);
        }

        // CREATE_INDEX_REFERENCES
        int NUM1 = 0;
        int NUM2 = 1;
        int NUM3 = 2;
        int NUM4 = 3;
        int NUM5 = 4;

        // PRINT -> num1 + num2 + num3 + num4 + num5
        System.out.println(numbers[NUM1] + numbers[NUM2] + numbers[NUM3] + numbers[NUM4] + numbers[NUM5]);

        // PRINT -> num1 - num2 + num3 / num4 * num5
        System.out.println(numbers[NUM1] - numbers[NUM2] + numbers[NUM3] / numbers[NUM4] + numbers[NUM5]);

        // CALCULATE -> average = sum / length
        double sum = numbers[NUM1] + numbers[NUM2] + numbers[NUM3] + numbers[NUM4] + numbers[NUM5];
        double average = sum / numbers.length;

        // PRINT -> average of num1, num2, num3, num4, and num5
        // 10 + 20 + 30 + 40 + 50 = 150 / 5 = 30.00
        System.out.println("Average: " + average);

        // method calls




    }

    // return_type method_name (parameters -> datatype variable_name);

    public static double sum(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }
}
