package c14_abstraction.Interfaces;

public class VolumeDownButton extends Button {
    @Override
    public void onDown() {
        System.out.println("볼륨 한 칸 내리기");
    }

    @Override
    public void onPressed() {
        System.out.println("볼륨 계속 내리기");
    }
}
