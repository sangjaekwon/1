package c08_method;

public class Overloading {
    public static void add() {
        System.out.println("add()");
    }
    public static void add(String s) {
        System.out.println("add(String s)");
    }
    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3));
    }
}
