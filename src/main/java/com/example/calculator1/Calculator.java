package com.example.calculator1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        boolean reVal = true;   // while 문에 들어가 작업을 계속할지를 받는 boolean, 초기값을 true로 지정하고 'exit' 이 들어오면 false로 바뀐다.

        while (reVal) {

            // 사용자로 부터 값을 입력받는 곳
            System.out.print("계산할 첫번째 숫자를 입력하세요! : ");
            int a = scan.nextInt();

            System.out.print("사칙연산 기호를 입력하세요! : ");
            String c = scan.next();
            char allSym = c.charAt(0);  // String으로 받은 값 중 첫번째 값만 char 형식으로 allSym에 저장

            System.out.print("계산할 두번째 숫자를 입력하세요! : ");
            int b = scan.nextInt();

            //switch 문으로 입력받은 연산기호에 맞게 계산
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

            // 결과값 출력 및 더 계산할지 여부 입력 받음
            System.out.println("결과 : " + result);
            System.out.println();
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String rework = scan.next();

            // 입력 받은 rework가 'exit'과 일치하는지 확인 후 일치하면 reVal을 false로 변환
            if (rework.equals("exit")) {
                reVal = false;
            }
        }
    }
}