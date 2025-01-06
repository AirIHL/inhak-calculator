package com.example.calculator2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Calculator {

    int a; // 값 1
    int b; // 값 2
    char sym; // 연산 기호

    private LinkedList<Integer> resultData = new LinkedList<Integer>();

    public LinkedList<Integer> getResultData() {
        return resultData;
    }

    public void setRemoveFirstResult() {
                LinkedList<Integer> newList = new LinkedList<>(resultData);
                newList.remove(0);
                this.resultData = newList;
    }

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
