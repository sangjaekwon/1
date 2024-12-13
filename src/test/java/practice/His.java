
package practice;

public class His {
    public static void main(String[] args) {
        int[] n = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19}; //배열 선언//배열 크기

        System.out.print("요소 값 \t히스토그램 \n");

        int max = 0; //최댓값 구하는 변수

        for (int i = 0; i < n.length; i++) { // 최댓값을 구하기 위한 for문
            if (max < n[i]) {
                max = n[i];
            }
        }
        while (max > 0) { // 최댓값만큼 반복하는 while문 최댓값이 19면 19번 반복
            for (int i = 0; i < n.length; i++) { // 한 줄 출력하는 for문
                if (n[i] > 0) { // 0보다 클 경우
                    System.out.print("*");
                    n[i]--; // 출력 후 1감소
                } else {
                    System.out.print(" "); // 0보다 작으면 빈 공간 출력
                }
            }
            System.out.println(); // 줄바꿈
            max--; // 1감사
        }
    }
}
