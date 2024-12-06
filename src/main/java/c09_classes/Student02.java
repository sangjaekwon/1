package c09_classes;

public class Student02 {
    int studentcode;
    String name;
    double score;

    public Student02(double score) {
        this.score = score;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(int studentcode) {
        this.studentcode = studentcode;
    }

    public Student02(int studentcode, String name) {
        this.studentcode = studentcode;
        this.name = name;
    }

    public Student02(int studentcode, String name, double score) {
        this.studentcode = studentcode;
        this.score = score;
        this.name = name;
    }
}
