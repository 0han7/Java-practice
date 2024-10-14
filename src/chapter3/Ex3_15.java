package chapter3;

import java.util.Scanner;

public class Ex3_15 {
    // 입력한 문자가 숫자인지 영문자인지 확인하는 코드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = ' '; // 입력값을 비교할 변수 생성

        System.out.print("문자를 하나 입력하시오: ");
        String input = sc.nextLine(); // 입력값을 문자열 변수에 저장
        ch = input.charAt(0); // 입력값을 ch에 저장
        if ( '0' < ch && ch <= '9'){
            System.out.println("입력하신 문자는 숫자입니다.");
        }

        if ( 'a'<= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'){
            System.out.println("입력하신 문자는 영문자입니다.");
        }
    }
}
