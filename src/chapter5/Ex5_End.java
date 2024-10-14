package chapter5;

import java.util.Arrays;

public class Ex5_End {
    public static void main(String[] args) {

        // 배열의 비교와 츌력 - equals(), toString()
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {
                            {11, 12},
                            {21, 22}
                        };
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
        System.out.println(Arrays.deepToString(arr2D)); // [[11, 12], [21, 22]]
        // 2차원 배열에는 toString이 아니라 deepToString이다.

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true


        // 배열의 복사 - copyOf(), copyOfRange()
        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = [0, 1, 2, 3, 4]
        int[] arr3 = Arrays.copyOf(arr, 3); // arr3 = [0, 1, 2]
        int[] arr4 = Arrays.copyOf(arr, 7); // arr4 = [0, 1, 2, 3, 4, 0, 0, 0]
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr5 = [2, 3]
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr6 = [0, 1, 2, 3, 4, 0, 0]

        // 배열의 정렬 - sort() : 배열을 정렬하는 메서드
        int[] sortArr = {3, 2, 0, 1, 4};
        Arrays.sort(sortArr); // 배열 arr을 정렬한다.
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]



    }
}
