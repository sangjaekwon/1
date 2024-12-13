package c08_method;

import java.util.Scanner;

public class ScoreCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubjects = 0;
        double score1;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;
//
//        System.out.print("첫 번째 점수 입력 -> ");
//        score1 = scanner.nextDouble();
//        System.out.print("두 번째 점수 입력 -> ");
//        score2 = scanner.nextDouble();
//        double score3 = scanner.nextDouble();
//
//        System.out.println("총 합은 " + (score1 + score2 + score3) + "점 입니다.");
//
//        totalScore = scoreCalculator.calculateSum(score1, score2, score3);
//        System.out.println("-------------------------");
//        System.out.println("총 합은 " + totalScore+ "접 입니다");

        while (!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1 입력) -> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);
            totalSubjects++;
            if (totalSubjects > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
                System.out.println("입력한 점수의 합계: " + totalScore + "\n입력한 점수의 평균: " + avgScore);
            } else {
                System.out.println("입력한 점수가 없습니다.");
//            System.out.println("총 점은 " + totalScore + "점 입니다.\n현재 과목의 수는 " + totalSubjects +"개 입니다.");
            }
            System.out.println("--------최종--------");
            if (totalSubjects > 0) {
                avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
                System.out.println("입력한 점수의 합계: " + totalScore + "\n입력한 점수의 평균: " + avgScore);
            } else {
                System.out.println("입력한 점수가 없습니다.");
            }
        }
    }
}
