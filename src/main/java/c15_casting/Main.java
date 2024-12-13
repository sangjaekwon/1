//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package c15_casting;



public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        Mouse mouse1 = new Mouse();
        CentralControl centralControl = new CentralControl(new Power[5]);
        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(tv1);
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);
        centralControl.displayInfo2();
        centralControl.powerOn();
        centralControl.powerOff();
    }
}
