package c11_access_midifiers;

public class StudentAccessModifierMain {
    public static void main(String[] args) {
        StudentAccessModifier student1 = new StudentAccessModifier();

        student1.setStudentCode(20241205);
        student1.setStudentAvg(100.0);
        student1.setStudentName("권상재");

        student1.showInfo();
    }
}
