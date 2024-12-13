package c17_bean;

/*
    project 생성시 gradle 선택
    -> build.gradle 파일 만들어짐
    -> wrap groovy로 만들기

    lombok '의존성 주입'
    chrome에서 mvn검색 -> https://mvnrepository.com/
    lombok 검색 -> 가장 상위 패치
    gradle(kotlin)파트 클릭해서 복사
    build.gradle.kits에서
    dependencies {
        여기에 복붙
        compileOnly("org.projectlombok:lombok:1.18.36")
        annotationProcessor("org.projectlombok:lombok:1.18.36")
    }
    코끼리+새로고침 모양 클릭

 */

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor

public class PersonLombok {
    private final String name;
    private int age;

    //@Annotation 용할 경우 충돌 발생하기 때문에 둘 중 하나만 사용
//    public PersonLombok(String name) {
//        this.name = name;
//    }
//
//    public PersonLombok(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
