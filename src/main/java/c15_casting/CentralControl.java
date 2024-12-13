//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package c15_casting;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        int emptyIndex = this.checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더이상 연결 x");
        } else {
            this.deviceArray[emptyIndex] = device;
            System.out.println(device.getClass().getSimpleName());
        }
    }

    public int checkEmpty() {
        for(int i = 0; i < this.deviceArray.length; ++i) {
            if (this.deviceArray[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public void powerOn() {
        for(int i = 0; i < this.deviceArray.length; ++i) {
            if (this.deviceArray[i] != null) {
                this.deviceArray[i].on();
            }
        }

    }

    public void powerOff() {
        for(int i = 0; i < this.deviceArray.length; ++i) {
            if (this.deviceArray[i] != null) {
                this.deviceArray[i].off();
            }
        }

    }

    public void displayInfo() {
        for(int i = 0; i < this.deviceArray.length; ++i) {
            if (this.deviceArray[i] != null) {
                System.out.println(this.deviceArray[i].getClass().getSimpleName());
            }
        }

    }

    public void displayInfo2() {
        System.out.println("현재 연결된 장치 목록: ");

        for(int i = 0; i < this.deviceArray.length; ++i) {
            if (this.deviceArray[i] == null) {
                System.out.println("[슬롯[" + i + "]번: 비어있음");
            } else {
                System.out.println("[슬롯[" + i + "]번: " + this.deviceArray[i].getClass().getSimpleName());
            }
        }

    }
}
