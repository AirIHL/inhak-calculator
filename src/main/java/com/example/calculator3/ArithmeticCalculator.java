package com.example.calculator3;

import java.util.LinkedList;

public class ArithmeticCalculator {
    // private로  연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정
    private LinkedList<Double> resultData = new LinkedList<>();

    public LinkedList<Double> getResultData() {
        return resultData;
    }
    // Getter로 값 반환
    public void setRemoveFirstResult() {
        if (!resultData.isEmpty()) {
            resultData.removeFirst();
        }
    }
    // Setter로 값 수정, resultData에 값이 있을때 수행
    // 제너릭 구현
    public <T extends Number> void calculate(T a, T b, char symbol) {
        OperatorType operator = OperatorType.fromSymbol(symbol);
        double result = operator.calculate(a, b);
        resultData.add(result);
    }
}