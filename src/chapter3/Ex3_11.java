package chapter3;

public class Ex3_11 {
    // Math_round()로 반올림 하기

    public static void main(String[] args) {
        double pi = 3.1415926;

        double shortPi1 = Math.round(pi * 1000) / 1000.0; // 3141.5에서 소수점 첫째자리에서 반올림 후(3142)ㄷ 나누기 1000 = 3.142
        System.out.println(shortPi1);

        /* 배운 내용
        1. Math.round()는 소수점 첫째자리에서 반올림하는 메서드이다.
        2. 다른 자리에서 반올림을 하고 싶으면 먼저 10자리로 곱한 다음 Math.round()를 사용하고 다시 10의 자리로 나누면 된다.
         */
    }
}
