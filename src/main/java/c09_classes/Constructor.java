package c09_classes;

public class Constructor {
    int num;
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;
    }

    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        name = title;
    }

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(int, String 매개변수 모두를 요구하는 생성자");
        this.num = num;
        this.name = name;
    }

    void showInfo() {
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
    public String toString() {
        return num + "\n" + name;
    }
}
