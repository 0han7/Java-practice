package chapter6;
// 참조형 매개변수

class Data2{int x;}
public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d); // 변경점 = 인수로 참조형 대입
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }


    static void change(Data2 d) {
        // 매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 메서드에게 넘겨줌
        // 때문에 값을 읽어오는 것뿐만 아니라 변경하는 것도 가능하다.
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
