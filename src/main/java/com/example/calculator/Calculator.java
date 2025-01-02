package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("계산할 첫번째 숫자를 입력하세요!");
        int a = scan.nextInt();

        System.out.print("계산할 두번째 숫자를 입력하세요!");
        int b = scan.nextInt();

        System.out.print("사칙연산 기호를 입력하세요!");
        String c = scan.next();
        char allSym = c.charAt(0);

        if(!(allSym == '*' || allSym == '/' || allSym == '+' || allSym == '-')) {
            System.out.println("기호를 잘 못 입력했습니다!!! 다시 입력하세요!!!");
        }


    }
}