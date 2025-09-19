package calculator;

public class Calculator {
    public Calculator(String owner){
        System.out.println("Hello. Im calculator. My owner is " + owner);
    }

    public double div(double x, double y) {
        return x / y;
    }
}
