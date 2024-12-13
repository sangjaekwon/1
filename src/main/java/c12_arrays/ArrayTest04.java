package c12_arrays;

import java.util.Arrays;

/*
    Scanner
    Random
    Arrays
    Integer
    Comparator

    Math.random() 메소드
    Java에서 난수를 생성하기 위해 Math.random() 메소드를 사용할 수 있음
    0.0 ~ 1.0 미만
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int sum = 0;
        int num2 = 0;

        for (int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < 10; i++) {
            sum += num[i];
            if (num[i] % 2 == 0) {
                num2 += num[i];
            }
        }
        System.out.println("배열의 총합: " + sum);
        System.out.println("배열의 짝수합: " + num2);
        System.out.println("배열: " + Arrays.toString(num));

    }
}
