package chapter2;

public class Ex2_12 {
    // 타입 간의 변환방법
    public static void main(String[] args) {

        String str = "3";

        System.out.println(str.charAt(0)); // 문자열 -> 문자
        System.out.println('3' - '0' +1); // 문자에서 '0'을 뺀다. / 문자 -> 숫자
        System.out.println(Integer.parseInt(str) + 1); // Interger.parseInt() or Double.parseDouble() 메서드를 사용한다.
        System.out.println("3" + 1); // 숫자에 문자열을 더하면 문자열이 나온다.
        System.out.println((char)(3 + '0')); // 숫자에 '0'을 더한다. -> 숫자를 문자로 변환
        System.out.println(str.charAt(0) - '0' + 1); // 숫자에 '0'을 더한다. -> 숫자를 문자로 변환

        /* 공부한 내용
        1. Integer.parseInt()
        2. Double.paresDouble()
        3. 문자 - '0' = 숫자
         */
    }
}
