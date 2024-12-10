package c14_abstraction.Interfaces;
/*
     인터페이스(interface)
        인터페이스는 자바에서 클래스가 구현해야 하는 '메소드'들의 집합을 정의하는 일종의 규익(protocol)
        인터페이스느 메소드의 시그니처(메소드 이름, 리턴 타입, 매개변수 목록)만을 포함하며, 메소드의 실제 구현은 포함하지 않음
        -> 추상메소드와 비슷함

        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음: 일반 클래스의 경우 하나의 클래스만 상속 가능

    특징
        1. 추상 메소드: 인터페이스 내의 모든 메소드는 기본적으로 추상 메소드 -> 즉, 메소드의 정의만 있고 구현은 없다.
        2. 상수: 인터페이스 내에서 선언된 변수는 '자동으로' public static final 상수로 취급됨.
        3. 다중상속: 클래스는 여러 인터페이스를 구현할 수 있다.

    추상 클래스와의 공통점
        - 추상 클래스
            1. 부분 구현 허용: 추상 클래스는 추상 메소드 뿐만 아니라 일반 메소드(구현이 포함된 메소드)도 포함할 수 있다.
            2. 상태 저장 가능: 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
            3. 생성자: 추상 클래스는 생성자를 가질 수 있다.
            4. 단일 상속: 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
            5. 다양한 접근 제어자(Access Modifier): 추상 클래스의 메소드와 변수는 다양한 접근 제어자(public, private, protected)를 가질 수 있다.

        - 인터페이스
            1. 완전한 추상화: 인터페이스는 기본적으로 모든 메소드가 추상 메소드이다. Java 8 이후에, default, static 메소드를 사용할 수 있긴하다.
            2. 인터페이스는 인스턴스 변수(필드 중 객체마다 값이 달라지는 변수)를 가질 수 없고, 상수만 선언 가능하다.
            3. 다중 상속: 클래스는 여러 인터페이스를 구현할 수 있다.
            4. 생성자 없음: 인터페이스는 생성자를 가질 수 없다. -> 이란 멤버 변수(인스턴스 변수)가 없기 때문에 생성자 생성 불가능 -> 객체마다 다른 값을 가질 수 없다
            5. 자동 public: 인터페이스의 메소드들은 자동으로 public이며, 메소드 선언에 접근 제어자를 명시할 수 있다. Java 8 이후에, default, static 메소드를 사용할 수 있긴하다.

 */


public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton());

        remoteController.onPressedPowerButton();

        remoteController.onPressedChannelDownButton();
        remoteController.onPressedChannelUpButton();

        remoteController.onUpChannelUpButton();
        remoteController.onDownChannelDownButton();

        remoteController.onDownVolumeDownButton();
        remoteController.onPressedVolumeDownButton();

        remoteController.onUpVolumeUpButton();
        remoteController.onPressedVolumeUpButton();


    }
}
