package c08_method;

import java.util.Scanner;

public class Method01 {
    /*
        메소드 관련 용어 정리
        1) 인수(argument): 사용자 메소드에 전달한 입력을 의미
        2) 매개변수(parameter): 인수를 받아서 저장하는 변수를 의미
        3) 반환값/출력값/리턴괎(return): 사용자의 메소드의 출력을 의미
        4) 메소드 호출(call): 만들어진 사용자 메소드를 실제로 사용하는 것을 의미
     */

    // [ x | x ]  [ 입력값 | 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }
    // [ o | x ]  [ 입력값 | 출력값 ]
    public static void call2(String dailyRoutine) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 일정: " + dailyRoutine);
    }
    // [ x | o ]  [ 입력값 | 출력값 ]
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";

        for(int i = 1; i <5; i++) {
            for(int j = 0; j<i; j++) {
                result += "*";

            }
            System.out.println();
        }
        return result;
    }
    // [ o | o ] [ 입력값 | 출력값 ]
    public static String call4(int year, int month, int date) {
        /**
         * DocString: 클래스나 메소드에 대한 설명을 하기 위한 주석 처리 방법
         * 전체 년월일을 string 형태로 변환하는 메소드
         */
        String day = "";
        day = year + "년 " + month + "월 " + date + "일";
        return day;
    }

    public static void main(String[] args) {
        call1();

        call2("Java method 강의 수강");

        Scanner scanner = new Scanner(System.in);

        String routine;
        System.out.print("오늘의 수업 후 일정은 무엇입니까? -> ");
        routine = scanner.nextLine();
        call2(routine);

        System.out.println(call3());

        String todayDate = call4(2024, 11, 29);
        System.out.println(todayDate);

        System.out.print("당신의 생일은 언제입니까? -> ");
        String myBirthday = scanner.nextLine();

    }
}
