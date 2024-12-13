package practice;
import java.util.Scanner;


public class StringCompression { // 문자열 압축하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력하세요 -> ");

        String str1 = scanner.nextLine();
        String[] str = str1.split("");
        String str2 = str[0];
        int k = 1;

        for (int i = 1; i < str.length; i++) {
            if (!str[i - 1].equals(str[i])) {
                System.out.print(str2 + k);
                str2 = str[i];
                k = 1;
                if (str.length - 1 == i) {
                    System.out.print(str[i] + "1");
                    break;
                }
            } else
                k++;
            if (str.length - 1 == i) {
                System.out.print(str2 + k);
            }
        }
    }
}
