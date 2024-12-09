package c12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest07 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;
        int num;

        System.out.println("로고");
        System.out.println("로또 번호 추첨");

        while (count > 0) {

            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;
                int number = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == number) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                    count--;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
