package c09_classes;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA();

        a1.name = "안근수";
        a1.callName();

        ClassA a2 = new ClassA();
        a2.name = "안근순";

        a2.callName();
    }
}
