package c12_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest03 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr)); // 배열 전체 출력

        String[] str = {"일", "이", "삼", "사", "오"};

        System.out.println(Arrays.toString(str));

        Integer[] arr3 = {4, 7, 10, 5, 2, 8, 3, 1};
        System.out.println("정렬 전 배열: " + Arrays.toString(arr3));

        Arrays.sort(arr3);
        System.out.println("오름차순 정렬: " + Arrays.toString(arr3));

        Arrays.sort(arr3, Comparator.reverseOrder());
        System.out.println("내림차순 정렬: " + Arrays.toString(arr3));


    }
}
