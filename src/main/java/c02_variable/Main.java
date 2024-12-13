package c02_variable;


public class Main {
    public static void main(String[] args) {
        // 1. 논리 자료형 변수: 참 거짓
        boolean checkFlag = false; // or true
        // 자로형 변수명 = 데이터; 변수 선언 및 초기화 방식
        System.out.println(checkFlag);

        checkFlag = true;
        System.out.println(checkFlag);

        boolean checkFlag3;
        checkFlag3 = true;

        // 2. 문자 자료형 변수
        char name1 = '권';
        char name2 = '상';
        char name3 = '재';

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 + name2 + name3);
        System.out.println("" + name1 + name2 + name3); //java의 경우 맨 앞의 자료형을 따라감
        // 즉, 큰 따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 봄

        name1 = '안';
        name2 = '근';
        name3 = '수';
        System.out.println("" + name1 + name2 + name3);

        // 3. 정수 자료형 변수
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1);
        System.out.println(width2);
        System.out.println(width1 + width2);

        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4);
        System.out.println(width1 + width3); //정수 + 문자열 = 문자열
        System.out.println(width4 + width2); //문자열 + 정수 = 문자열

        // java17 버전 이후 여러줄에 걸친 데이터를 하나의 변수에 대입 가능 큰따옴표 3개
        String introduction = """
                안
                근
                수
                1
                2
                3
                """;
        System.out.println(introduction);

        String introduction2 = """
                
                권상재
                컴공
                대학생
                ISTJ
                """;
        System.out.println(introduction2);

        // int longNumber = 123141241241234212312; 오류
        long time = System.currentTimeMillis();
        System.out.println(time);
        /* int (4바이트)
            최소: -2^31 약 -21억
            최대: 2^31 -1 약 21억
           long (8바이트)
            최소: -2^63 약 -922경
            최대: 2^63 -1 약 922경
        */

        // 4. 실수 자료형 변수
        double pi = 3.141592;
        System.out.println(pi);

        // 5. 상수
        final String FILE_PATH = "~/Desktop/web_java";
        System.out.println(FILE_PATH);
        final String EXAMPLE_OF_FINAL;
        //EXAMPLE_OF_FINAL = "아아아아아"; 오류

        /*
            상수 특징:
            1) 상수명 대문자로 작성, 단어 사이 경계 '_'
            2) 재대입 불가
         */

    }
}
