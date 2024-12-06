package c10_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

   /*
        Setter / Gertter
        set변수명() / get변수명() 으로 사용
    */

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (age >= 0 && age < 150) {
                this.age = age;
                break;
            } else {
                System.out.print("다시 입력하세요 -> ");
                age = scanner.nextInt();
            }
        }
    }

    public int getAge() {
        return age;
    }
}