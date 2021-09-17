public class CalculatorApp {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.number1 = 20.00;
        calculator.number2 = 50.00;

        double result1 = calculator.sum();
        double result2 = calculator.min();

        System.out.println("Result: " + result1);
        System.out.println("Result2: " + result2);

    }
}
