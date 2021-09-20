package clean_code;

public class Calculator {
    private double number1;
    private double number2;

    public double getNumber1(){
        return this.number1;
    }

    public void setNumber1(double number1){
        this.number1 = number1;
    }

    public double sum(){
        return (this.number1 + this.number2);
    }

    public double min(){
        return (this.number1 - this.number2);
    }
}
