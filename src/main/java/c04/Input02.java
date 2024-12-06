package c04;

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 실수 입력: ");
        double num1 = scanner.nextDouble();
        System.out.print("두번째 실수 입력: ");
        double num2 = scanner.nextDouble();
        System.out.print("세번째 실수 입력: ");
        double num3 = scanner.nextDouble();
        System.out.println("총합: " + (num1+num2+num3));
        System.out.println("평균: " + (num1+num2+num3) / 3);
    }
}
