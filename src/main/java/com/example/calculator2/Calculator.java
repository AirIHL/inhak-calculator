package com.example.calculator2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Calculator {

    int a; // 값 1
    int b; // 값 2
    char sym; // 연산 기호

    // private로  연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정
    private LinkedList<Integer> resultData = new LinkedList<Integer>();

    // Getter로 값 반환
    public LinkedList<Integer> getResultData() {
        return resultData;
    }

    // Setter로 값 수정, resultData에 값이 있을때 수행
    public void setRemoveFirstResult() {
        if (!resultData.isEmpty()) {
            resultData.removeFirst();
        }
    }

    // 계산하는 메서드
    public void Calculate(int valA, int valB, char allSym) {
        a = valA;
        b = valB;
        sym = allSym;

        int result = 0;

        switch (allSym) {

            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("기호를 잘 못 입력했습니다!!! 다시 입력하세요!!!");
                break;
        }
        resultData.add(result);
    }
}
