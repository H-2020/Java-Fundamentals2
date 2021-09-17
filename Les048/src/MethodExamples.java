public class MethodExamples {

    public static void main(String[] args) {


        // new requirement:
        // all numbers must be greater or equal to 30

        System.out.println("App Starting...");

        System.out.println("Sum of number5 and number6 is " + sum(50, 60));
        System.out.println("Sum of number4 and number5 is " + sum(40, 50));
        System.out.println("Sum of number3 and number4 is " + sum(30, 40));
        System.out.println("Sum of number2 and number3 is " + sum(20, 30));
        System.out.println("Sum of number1 and number2 is " + sum(10, 20));

        System.out.println("App stopped...");


    }

    public static double sum(double number1, double number2) {
        double result = number1 + number2;
        if (number1 < 30 || number2 < 30) {
            System.err.println("Numbers must be greater than 30");
            System.exit(-1);
        }
        return result;
    }

    public static double min(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public static double mul(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    public static double div(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

}
