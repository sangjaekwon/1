//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package c15_casting;

public class EnhancedForSentence {
    public EnhancedForSentence() {
    }

    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 95};
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < scores.length; ++i) {
            sum1 += scores[i];
        }

        for(int score : scores) {
            sum2 += score;
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
