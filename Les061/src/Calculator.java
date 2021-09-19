package be.intecbrussel.students.hilal.less061;

public class Calculator {
    double number1;
    double number2;

    // CONSTRUCTOR
    // NameOfTheClass(parameters: ...){ }

    Calculator(double paramNumber1, double paramNumber2) {
        number1 = paramNumber1;
        number2 = paramNumber2;
    }

    double sum() {
        double result = number1 + number2;
        return result;
    }

    double mul() {
        double result = number1 * number2;
        return result;
    }

    double min() {
        double result = number1 - number2;
        return result;
    }

    double div() {
        double result = number1 / number2;
        return result;
    }

}
