package c13_inheritance;

public class Animal {

    String animalName;
    int animalAge;

    public Animal() {
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }
}
