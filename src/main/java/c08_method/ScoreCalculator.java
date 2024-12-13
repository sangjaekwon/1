package c08_method;

public class ScoreCalculator {
    /*
        총합을 내는 매소드
     */
    public double calculateSum(double score1, double score2) {
        return score1 + score2;
    }

    public double calculateAvg(double totalScore, int numberOfSubjects) {
        return totalScore / numberOfSubjects;
    }

    public double calculateSum(double score1, double score2, double score3) {
        return score1 + score2 + score3;
    }
    public double calculateSum2(double totalScore, double score2) {
        return totalScore + score2;
    }
    public double calculateSum(double score1, double score2, double score3, double score4) {
        return score1 + score2 + score3 + score4;
    }
    public double calculateSum(double score1, double score2, double score3, double score4, double score5) {
        return score1 + score2 + score3 + score4 + score5;
    }
}
