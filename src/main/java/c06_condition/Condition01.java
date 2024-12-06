package c06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수 입력 -> ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("num은 양수");
        } else if(num == 0) {
            System.out.println("num은 0");
        }
        else {
            System.out.println("num은 음수");
        }

    }
}
