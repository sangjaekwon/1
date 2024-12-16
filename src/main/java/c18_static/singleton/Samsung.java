package c18_static.singleton;

import lombok.Getter;

public class Samsung {

    @Getter
    private String company;
    private int serialNumber;

    // 여기서 부터 싱글톤 패턴
    // 1. 스태틱 변수 정의 -> 보통 객체명을 instance로 씀
    private static Samsung instance = null;

    // 2. 기본 생성자 정의
    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber  = 20240000;
    }
    // 3. static 메소드를 정의 -> 보통 getInstance()로 정의 // public
    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }

        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
}
