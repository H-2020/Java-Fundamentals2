package be.intecbrussel.students.hilal.less061;

public class CalculatorApp {

    public static void main(String[] args) {


        HelloWorlder helloFromTheSamePackage = new HelloWorlder();
        helloFromTheSamePackage.sayHello();
        helloFromTheSamePackage.print();

        Calculator calculator = new Calculator(10, 20);

        System.out.println(calculator.sum());
        System.out.println(calculator.min());
        System.out.println(calculator.mul());
        System.out.println(calculator.div());
    }
}
