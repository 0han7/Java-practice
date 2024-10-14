package chapter3;

public class Ex3_10 {
    // 산술 변환
    public static void main(String[] args) {

        int a = 1_000_000; // 1,000,000 1백만
        int b = 2_000_000; // 2,000,000 2백만

        long c = a * b; // 2,000,000,000,000 일까? 답은 아니다.
        System.out.println("c : "+ c);

        long result1 = 1_000_000 * 1_000_000; // int * int = int
        long result2 = 1_000_000 * 1_000_000L; // int * long = long
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

    }
}
