package c04;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.print("윤년인지 확인하고자 하는 년도릃 입력하세요 -> ");
        year = scanner.nextInt();


        boolean result = (year%4 == 0) && (year %100 != 0) || (year % 400 == 0);
        System.out.println(year + "년은 윤년입니까? -> " + result);

    }
}
