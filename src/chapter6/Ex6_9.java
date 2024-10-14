package chapter6;
// static 메서드와 인스턴스 메서드 예제
class MyMath2 {
    long a, b;

    // 인스턴스 변수 a,b 만을 이용하여 작업하므로 매개변수가 필요 없다.
    long add() { return a + b;}
    long subtract() { return a - b;}
    long multiply() { return a * b;}
    double divide() { return a / b;}

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능
    static long add(long a, long b) { return a + b;} // a,b는 지역변수
    static long subtract(long a, long b) { return a - b;}
    static long mulitply(long a, long b) { return a * b;}
    static double divide(long a, long b) { return a / (double) b;}
}

public class Ex6_9 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 100l)); // 클래스 호출(인스턴스 생성 x)
        System.out.println(MyMath2.subtract(200L, 100l));
        System.out.println(MyMath2.mulitply(200L, 100l));
        System.out.println(MyMath2.divide(200L, 100l));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능하다.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
