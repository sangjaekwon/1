package c13_inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("바둑이");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("나비", 2);

        animal1.move();
        animal2.move();
        animal3.move();
        animal4.move();

        Human human1 = new Human();
        human1.move();
        human1.setName("권상재");
        human1.setAge(22);
    }
}
