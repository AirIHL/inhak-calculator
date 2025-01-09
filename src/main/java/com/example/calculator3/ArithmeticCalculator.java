package com.example.calculator3;

import java.util.LinkedList;

public class ArithmeticCalculator {
    private LinkedList<Double> resultData = new LinkedList<>();

    public LinkedList<Double> getResultData() {
        return resultData;
    }

    public void setRemoveFirstResult() {
        if (!resultData.isEmpty()) {
            resultData.removeFirst();
        }
    }

    public <T extends Number> void calculate(T a, T b, char symbol) {
        OperatorType operator = OperatorType.fromSymbol(symbol);
        double result = operator.calculate(a, b);
        resultData.add(result);
    }
}