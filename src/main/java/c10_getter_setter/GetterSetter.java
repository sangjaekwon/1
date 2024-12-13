package c10_getter_setter;
/*
    1. Setter / Getter의 필요성
        문제 상황
    class Person {
        String name;
        int age;
    }
    class PersonMain {
        public static void main(String[] args) {
            Person person = new Person();
            person.name = "안근수";
            person.age = -10;
        }
    }
    나이에 정상적이지 않은 값 대입
    외부에서 값 대입을 통제할 수 있는 방법 -> Setter / Getter

    해결책: 캡슐화
    클래스 내부의 데이터를 외부에서 바로 접근하지 못하게 하고, 대신 메소드를 통해서 간접적으로 접근하도록 만드는 것.
    이를 통해 데이터의 유효성을 검증하거나 특정한 로직을 추가 할 수 있다.

    Setter / Getter 장점
    1) 데이터 보호
        변수에 private 접근 제어자를 사용하여 외부에서 직접 접근하지 못하게 함으로써 데이터를 보호할 수 있음
    2) 데이터 유효성 검증
        Setter 메소드에서 입력된 데이터가 적합한지 확인하고, 잘못된 값을 거부할 수 있음.
    3) 캡슐화 유지
        데이터를 숨기고 피룡한 경우메나 제한적으로 접근할 수 있게 하여 클래스 내부 구현을 외부에 노출하지 않음
    4) 유연성 증가
        나중에 요구사항이 바뀌어 데이터를 설정하거나 조회하는 방법이 변경되더라도 클래스 내부의 메소드만 수정하면 되므로 유지 보수가 쉬워짐
 */


public class GetterSetter {
}
