package c14_abstraction.Interfaces;

public class VolumeUpButton extends Button {
    @Override
    public void onUp() {
        System.out.println("볼륨 한 칸 올리기");
    }

    @Override
    public void onPressed() {
        System.out.println("볼륨 계속 올리기");
    }
}
