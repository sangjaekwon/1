package c16_object_classes;

import java.util.Objects;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId= studentId;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    @Override
    public String toString() {
        return "해당 학생의 이름은 " + name + "이고, 학번은 " + studentId + "입니다";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
}
