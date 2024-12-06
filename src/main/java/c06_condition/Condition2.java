package c06_condition;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("점수 입력 -> ");
//        int grade = scanner.nextInt();
//        String score;
//
//        System.out.print("당신의 등급은 ");
//        if(grade <= 100 && grade >=90) {
//            System.out.println("A입니다.");
//        } else if (grade >= 80) {
//            System.out.println("B입니다.");
//        } else if (grade >= 70) {
//            System.out.println("C입니다.");
//        } else if (grade >= 60) {
//            System.out.println("D입니다.");
//        } else {
//            System.out.println("F입니다.");
//        }
//        if(grade <= 100 && grade >=90) {
//            score = "A";
//        } else if (grade >= 80) {
//            score = "B";
//        } else if (grade >= 70) {
//            score = "C";
//        } else if (grade >= 60) {
//            score = "D";
//        } else {
//            score = "F";
//        }
//        System.out.print("당신의 등급은 " + score + "입니다.");
//
//
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        int point;
        System.out.print("포인트 점수 입력 -> ");
        point = scanner.nextInt();
        String grade;

        if(point >= VIP_POINT) {
            grade = "VIP";
        } else if (point >= GOLD_POINT) {
            grade = "GOLD";
        } else if (point >= SILVER_POINT) {
            grade = "SILVER";
        } else if (point >= BRONZE_POINT){
            grade = "BRONZE";
        } else {
            grade = "일반";
        }
        System.out.println("당신의 포인트는 " +point+"점이고, 등급은 " + grade+ "등급입니다.");

    }
}
