package chapter4;

import java.util.Scanner;

public class Ex4_15 {
    // do-while
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;

        answer = (int) (Math.random() * 100) + 1; // 1~100 사이의 난수
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요: ");
            input = sc.nextInt();
            if (input > answer) {
                System.out.println("더 작은 수로 다시 시도하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도하세요");
            }
        } while (input != answer); // 두 수가 같으면 반복을 벗어남
        System.out.println("정답입니다!");
    }
}
/* 공부한 내용
 1. do while은 블럭을 먼저 수행한 후에 조건식을 평가한다.
 2. while문 끝에 세미콜론(;)을 넣어줘야 한다.
 */
