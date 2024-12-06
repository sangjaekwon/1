package c04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력 ->");
        String name1 = scanner.next();
        scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println("당신의 이름은: " + name1  + ", " + name2);
    }
}
