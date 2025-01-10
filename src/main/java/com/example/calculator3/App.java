package com.example.calculator3;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();
        boolean reVal = true;
        double result = 0;

        while (reVal) {
            System.out.print("계산할 첫번째 숫자를 입력하세요! : ");
            double a = scan.nextDouble();

            System.out.print("계산할 두번째 숫자를 입력하세요! : ");
            double b = scan.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요! : ");
            String c = scan.next();
            char allSym = c.charAt(0);

            cal.calculate(a, b, allSym);
            LinkedList<Double> results = cal.getResultData();

            if (results.size() > 6)
                cal.setRemoveFirstResult();

            System.out.printf("결과 : %.2f\n", results.getLast());
            System.out.println("========================");
            System.out.println("전체 계산 기록: " + results);
            System.out.println();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String rework = scan.next();

            if (rework.equals("exit")) {
                reVal = false;
            }
        }
    }
}