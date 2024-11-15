package chapter6;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t; // Tv 인스턴트를 참조하기 위한 변수 t 선언
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
        t.channelUp();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}


class Tv{
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {power = !power;} // Tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp() {++channel;} // Tv의 채널을 높이는 기능을 하는 메서드
    void channelDown() {--channel;} // Tv의 채널을 낮추는 기능을 하는 메스드

}