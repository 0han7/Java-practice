package chapter4;

public class Ex4_7 {
    // 임이의 정수 만들기 Math.random()
    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i < 5; i++) { // 5번 반복
            num = (int) (Math.random() * 6 ) + 1; // 1~6자리의 수
            System.out.printf("\"num\" = %d%n", num);
        }
    }
}

 /*
 오늘 배운 내용
    1. Math.random()은 0.0(이상)에서 1.0(미만) 사이의 double값을 반환한다.
    2. 0.0 <= Math.random <1.0
    3. 정수를 구하고 싶으면 int형으로 변환한다.
    4. 예) 1에서 10까지 난수 = (int) (Math.random() * 10 ) + 1
  */