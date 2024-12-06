package c08_method;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int totalSubjects = 0;
        double score1;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;

        while(!endOfCalc) {
            System.out.print("점수 입력(종료는 -1) -> ");
            double score = scanner.nextDouble();
            if(score == -1) {
                break;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score);

            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
            System.out.println("입력한 점수의 합계: " + totalScore + "\n입력한 점수의 평균: " + avgScore);
        }
    }
}
