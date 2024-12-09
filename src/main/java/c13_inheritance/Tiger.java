package c13_inheritance;

public class Tiger extends Animal {

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 걷습니다.");
    }
}
