package c04;


import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String address;
        String phone;

        System.out.print("이름 입력 -> ");
        name = scanner.nextLine();
        System.out.print("나이 입력 -> ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소 입력 -> ");
        address = scanner.nextLine();
        System.out.print("연락처 입력 -> ");
        phone = scanner.nextLine();

        System.out.println("사용자 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        System.out.println("주소는 " + address + "이며, 연락처는 " + phone + "입니다.");
    }
}
