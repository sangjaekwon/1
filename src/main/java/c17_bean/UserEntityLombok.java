package c17_bean;

import lombok.Data;


/*
    Lombok
        자바에서 반복적으로 작성해야 하는 코드를 자동으로 생성해주는 라이브러리
    장점:
        코드의 가독성을 높일 수 있다 -> 주석을 통한 Annotation을 붙여 코드 생성을 제어 가능
        특히 스크롤링해서 Setter가 있는지 없는지, 특정한 field에 대한 Setter/Getter의 유무 등을 고려할 필요 없이 @ 파트만 보더라도 코드의 흐름을 알 수 있음
    1. @Data
        - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualAndHashCode
        종합 패키지
    2. @NoArgsConstructor
        - 기본 생성자 생성
    3. @RequiredArgsConstructor
        - final 또는 @NonNUll로 지정된 필드를 매개변수로 받는 생성자를 생성
        - 초기화를 강제하기 위한 수단으로 쓰임
    4. @Getter / @Setter
        - 각 필드에 대한 Getter Setter 생성
        - 클래스 레벨에 사용하면 모든 필드에 대해, 필드 레벨에 사용하면 특정 필드에 대해서만 Getter Setter 생성됨
        - 단 @Setter 기준으로 final 필드에는 Setter 생성 x
    5. @EqualAndHashCode
        - equals()와 hashCode() 메소드를 자동으로 생성 -> 둘이 세트기 때문
    6. @ToString
        - toString() 메소드를 자동으로 생성
        - 객체의 필드 값을 문자열로 표현해주는 메소드
 */
@Data
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;
}
