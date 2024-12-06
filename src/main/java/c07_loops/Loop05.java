package c07_loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        System.out.print("숫자를 입력하세요 -> ");

        for (int i = 1; i < count + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
