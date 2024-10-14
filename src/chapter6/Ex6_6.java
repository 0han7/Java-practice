package chapter6;
// 기본형 매개변수

class Data { int x; }
public class Ex6_6 {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("Afer change(d.x)");
        System.out.println("main() : x = " + d.x); // 10 출력
    }

    static void change(int x) {
        x = 1000; // change메서드의 매개변수 x의 값이 변경된 것, 즉 원본이 아닌 복사본이 변경
        System.out.println("change() : x = " + x);
    }
}



