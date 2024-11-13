package chpater8;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e; // 예외를 발생시킴
            // throw new Exception("고의로 발생시켰음")과 같다.
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상 종료되었음.");
    }
}
/* Exception 인스턴스를 생성할 때, 생성자에 String을 넣어 주면, 이 String이 Exception 인스턴스에 메세지로 저장된다.
이 메세지는 getMessage()를 이용해서 얻을 수 있다.
 */