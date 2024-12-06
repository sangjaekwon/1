package c09_classes;

public class Student {
    int num;
    String name;
    char grade;

    Student() {

    };

    Student(int num) {
        this.num = num;
    }
    Student(String name) {
        this.name = name;
    }
    Student(char grade) {
        this.grade = grade;
    }
    Student(int num, String name, char grade) {
        this.num = num;
        this.name = name;
        this.grade = grade;
    }
    void showInfo() {
        System.out.printf("학번: %d\n이름: %s\n점수: %c", num, name, grade);
    }
}
