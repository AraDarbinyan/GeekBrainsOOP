package main.java;

import calculator.ComplexNumber;
import calculator.Calculator;
import calculator.operations.Addition;
import calculator.operations.Multiplication;
import calculator.operations.Division;
import calculator.logging.Log4jLogger;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Log4jLogger());

        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(1, -1);

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        ComplexNumber sum = calculator.performOperation(addition, a, b);
        ComplexNumber product = calculator.performOperation(multiplication, a, b);
        ComplexNumber quotient = calculator.performOperation(division, a, b);

        // Ваши действия с результатами операций
    }
}
