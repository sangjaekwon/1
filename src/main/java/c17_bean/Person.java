package c17_bean;
public class Person {
    private final String name; // 필드에 final이 붘으면 생성자들을 만들 때 필수로 들어가야 한다
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
