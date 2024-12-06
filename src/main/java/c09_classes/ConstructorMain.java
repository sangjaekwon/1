package c09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor0 = new Constructor();

        constructor0.num = 38;
        constructor0.name = "안근수";

        Constructor constructor1 = new Constructor(37);

        constructor1.num = 22;
        constructor1.name = "권상재";

        System.out.println(constructor0.num);
        System.out.println(constructor0.name);
        System.out.println(constructor1.num);
        System.out.println(constructor1.name);

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";

        Constructor constructor2 = new Constructor();
        System.out.print("나이 입력 -> ");
        constructor2.num = scanner.nextInt();
        System.out.print("이름 입력 -> ");
        constructor2.name = scanner.nextLine();

        System.out.println("당신의 이름은 " + constructor2.name + "이고\n당신의 나이는 " + constructor2.num + "입니다.");

        Constructor constructor3 = new Constructor(age);
        System.out.println(constructor3.num);



        Constructor constructor4 = new Constructor("김일");
        constructor4.num = 20;
        System.out.println(constructor4.num + constructor4.name);


        Constructor constructor5 = new Constructor(21, "김이");
        System.out.println(constructor5);
        constructor5.showInfo();
    }
}
