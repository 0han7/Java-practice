package chapter5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5_1 {
    // 배열의 출력
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] charr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i +1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) +1;
        }

        // 배열에 저장된 값들을 출력한다.
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2)); // Arrays.toString()은 []형식의 문자열로 출력
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(charr));
        System.out.println(iArr3); // 참조값
        System.out.println(charr); // 기본형이라 그대로 출력
    }
}
