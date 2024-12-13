package c13_inheritance;

public class Human extends Animal {

    int age;
    String name;

    public Human(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Human() {

    }

    @Override
    public void move() {
        System.out.println("두 발로 걷습니다");
    }
}
