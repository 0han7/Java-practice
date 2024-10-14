package chapter3;

public class Ex3_14 {
    // 문자열 비교
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        // 원래 String은 클래스이므로 str2 와 같이 new를 사용해서 객체를 생성해야 한다.


        String str3 = new String("abc");
        String str4 = "abc"; // 위의 문장을 간단하게 표현
        // 그러나 특별히 String만 new를 사용하지 않고 위와 간단히 쓸 수 있게 허용한다.

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc"); // true
        System.out.printf("\"abc\" == \"abc\" ? %b%n", str1 == "abc"); // true
        System.out.printf("\"abc\" == \"abc\" ? %b%n", str2 == "abc"); // 내용은 같지만 서로 다른 객체이므로 false
        System.out.printf("\"str1.equals(\"abc\")\" ? %b%n", str1.equals("abc")); // true
        System.out.printf("\"str2.equals(\"abc\")\" ? %b%n", str2.equals("abc")); // true
        System.out.printf("\"str1.equals(\"ABC\")\" ? %b%n", str1.equals("ABC")); // false
        System.out.printf("\"str2.equals(\"ABC\")\" ? %b%n", str2.equals("ABC")); // false
        System.out.printf("\"str1.equalsIgnoreCase(\"ABC\")\" ? %b%n", str1.equalsIgnoreCase("ABC")); // ture
        System.out.printf("\"str2.equalsIgnoreCase(\"ABC\")\" ? %b%n", str2.equalsIgnoreCase("ABC")); // ture

        /*
        공부한 내용
        1. 두 문자열을 비교할 때는 '==' 대신 equals() 메서드를 사용해야 한다.
        2. 문자열이 같더라도 객체가 다르면  false를 나타내기 때문이다.
        3. equals() 메서드는 객체가 다르더라더 문자열이 같으면 true를 나타낸다.
        4. 대소문자의 유무와 상관없이 나타내고 싶으면 equalsIgnoreCase()를 사용한다.
         */
    }
}
