package chapter2;

import java.util.Scanner;

public class Ex2_10 {
    // 화면으로부터 입력받기
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스 객체 생성

        String input = sc.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 문자열 input을 int 형으로 변환하는 메서드

        int num2 = sc.nextInt(); // int형의 입력값을 num2에 저장
        float num3 = sc.nextFloat(); // float형의 입력값을 num2에 저장

        // 출력
        System.out.println(input);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
     */

    // 예제 2-10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 자리 정수를 하나 입력해주세요.>"); // pint는 줄바꿈 하지 않음
        String input = sc. nextLine(); // 문자형 입력
        int num = Integer.parseInt(input); // 입력받은 문자열을 정수로 변환

        System.out.println("입력내용 : " + input); // input의 22는 문자형
        System.out.println(input + 22 + "<- 문자형");
        System.out.println(num + 22);
    }
}
