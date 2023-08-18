package calculator.operations;

import calculator.ComplexNumber;

public interface Operation {
    ComplexNumber calculate(ComplexNumber a, ComplexNumber b);
}
