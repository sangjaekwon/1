package c12_arrays;

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names;

        System.out.print("몇명의 학생을 등록하시겠습니까 -> ");
        names = new String[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번째 학생: ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + ". " + names[i]);
        }
    }
}

