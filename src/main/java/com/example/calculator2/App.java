package com.example.calculator2;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();
        boolean reVal = true;    // while 문에 들어가 작업을 계속할지를 받는 boolean, 초기값을 true로 지정하고 'exit' 이 들어오면 false로 바뀐다.
        int result = 0;

        while (reVal) {
            // 사용자로 부터 값을 입력받는 곳
            System.out.print("계산할 첫번째 숫자를 입력하세요! : ");
            int a = scan.nextInt();

            System.out.print("사칙연산 기호를 입력하세요! : ");
            String c = scan.next();
            char allSym = c.charAt(0);  // String으로 받은 값 중 첫번째 값만 char 형식으로 allSym에 저장

            System.out.print("계산할 두번째 숫자를 입력하세요! : ");
            int b = scan.nextInt();

            cal.Calculate(a, b, allSym);
            // Getter를 통해 값을 받아옴
            LinkedList<Integer> results = cal.getResultData();

            // results의 값이 6개가 넘어가면 Setter 메서드를 통해 값이 삭제
            if (results.size() > 6)
                cal.setRemoveFirstResult();

            // 결과값 출력 및 더 계산할지 여부 입력 받음
            System.out.println("결과 : " + results.getLast());
            System.out.println("========================");
            System.out.println("전체 계산 기록: " + results);
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