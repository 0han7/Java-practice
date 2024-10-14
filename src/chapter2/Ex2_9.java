package chapter2;

public class Ex2_9 {
    // printf를 이용한 출력 예제
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;
        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1); // %n은 출력 후 줄바꿈을 하는 지시자이다.
        System.out.printf("f1 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f1 = %f, %e, %g%n", f3, f3, f3);
        System.out.printf("d=%f%n", d); // %f는 기본적으로 소수점 6자리까지만 출력, 7자리에서 반올림
        System.out.printf("d=%14.10f%n", d); // %전체자리.소수점아래자리f , 전체 14자리 중 소수점 10자리 그리고 나머지는 공백
        System.out.printf("d=%014.10f%n", d); // 지시자를 %014.10f로 지정하면 양쪽 빈자리에 모두 0으로 채운다.
        System.out.printf("[123456789]%n");
        System.out.printf("[%s]%n",url);
        System.out.printf("[%20s]%n",url);
        System.out.printf("[%-20s]%n",url); // 왼쪽 정렬
        System.out.printf("[%.8s]%n",url); // .을 붙이면 문자열의 일부분만 출력 가능 / 왼쪽에서 8글자만 출력

        /* 배운 내용
        1. printf : 지시자를 통해 원하는 모양으로 출력 가능
        2. 줄바꿈을 하려면 %n을 해야 한다.
        3. %f : %전체자리.소수점자리f" / 기본값은 소수점 6자리까지 출력하고 7자리에서 반올림한다.
        4. 전체자리 앞에 0을 넣으면 빈 공간에 0이 들어간다.
        5. %s도 원하는 만큼 출력공간을 확보할 수 있다.
        6. 기본으로 우측 정렬 / '-'붙일 시 왼쪽 정렬
        7. ".숫자" 입력 시 '숫자'글자만 출력
         */
    }
}
