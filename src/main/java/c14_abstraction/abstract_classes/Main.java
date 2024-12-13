package c14_abstraction.abstract_classes;

/*
    추상 클래스
    1. 추상 메소드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 한다.
    2. 추상 클래스의 객체는 생성할 수 없다.
    3. 그 외의 다른 특징은 일반 클래스와 동일함.
    4. 상속을 전제로 하는 클래스이다.

    추상 클래스: 추상 메소드가 하나 이상인 클래스
    추상 메소드: 선언만 있고, 구현은 없는 메소드

    추상 클래스의 장점:
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목적
        1. 공통된 기능 제고이: 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의할 수 있다.
        2. 구체적인 구현 강제: 추상 메소드를 통해 서브 클래스가 반드시 특정 메소드를 구현하도록 강제할 수 있다.
        3. 코드의 재사용성: 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

    추상 클래스엑서 주의할 점:
        - 추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 슈퍼 클래스의 멤버 및 메소드에 접근하기 위해서 사용
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory("일반 공장") {
            @Override
            public void produce(String model) {

            }

            @Override
            public void manage() {

            }
        };

        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");

        phoneFactory1.produce("아이폰16");
        phoneFactory1.produce("아이폰16 프로");

        tabletFactory1.produce("아이패드 프로 13인치 7세대");

        System.out.println();

        phoneFactory1.manage();
        tabletFactory1.manage();
        System.out.println();

        phoneFactory1.printInfo();
        tabletFactory1.printInfo();
    }
}
