package com.example.calculator2;

public class Calculator {

    int a; // 값 1
    int b; // 값 2
    char sym; // 연산 기호

    public int Calculator(int valA, int valB, char allSym) {
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
        return result;
    }
}
