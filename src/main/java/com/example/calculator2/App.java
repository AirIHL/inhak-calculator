package com.example.calculator2;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        boolean reVal = true;
        int result = 0;

        while(reVal) {
            System.out.print("계산할 첫번째 숫자를 입력하세요! : ");
            int a = scan.nextInt();

            System.out.print("계산할 두번째 숫자를 입력하세요! : ");
            int b = scan.nextInt();

            System.out.print("사칙연산 기호를 입력하세요! : ");
            String c = scan.next();
            char allSym = c.charAt(0);

            cal.Calculate(a, b, allSym);
            LinkedList<Integer> results = cal.getResultData();

            if(results.size() > 6)
                cal.setRemoveFirstResult();

            System.out.println("결과 : " + results.getLast());
            System.out.println("========================");
            System.out.println("전체 계산 기록: " + results);
            System.out.println();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String rework = scan.next();

            if(rework.equals("exit")) {
                reVal = false;
            }
        }
    }
}