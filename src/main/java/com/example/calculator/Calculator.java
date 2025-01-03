package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        boolean reVal = true;

        while(reVal) {
            System.out.print("계산할 첫번째 숫자를 입력하세요! : ");
            int a = scan.nextInt();

            System.out.print("계산할 두번째 숫자를 입력하세요! : ");
            int b = scan.nextInt();

            System.out.print("사칙연산 기호를 입력하세요! : ");
            String c = scan.next();
            char allSym = c.charAt(0);

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

            System.out.println("결과 : " + result);
            System.out.println();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String rework = scan.next();

            if(rework.equals("exit")) {
                reVal = false;
            }
        }
    }
}