package c08_method;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int a;
        int b;

        System.out.print("a값 입력 -> ");
        a = scanner.nextInt();
        b = random.nextInt();

        System.out.println("a의 값: " + a+ "\nb의 값: " + b);
    }
}
