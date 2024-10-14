package chapter3;

public class Ex3_6 {
    // 사칙 연산자
    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        System.out.printf("%d / %d = %d%n", a, b, a / b); // (int)10 / (int)4 = 2(int) 소수점 탈락
        System.out.printf("%d / %f = %f%n", a, (double)b, a / (double)b); /* (int)10 / (double) 4 = 2.5(double)
        그리고 실수형(double)이기 때문에 %d 대신 %f를 해야 한다.
        */
    }
}
