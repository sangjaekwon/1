package practice;
import java.util.Scanner;

public class InformationPaging { // 게시판 페이징
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총건수, 한페이지에 보여줄 게시판 수 입력: ");
        int result;

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (m % n == 0) {
            result = m / n;
        } else if (m == 0) {
            result = 0;
        } else {
            result = m / n + 1;
        }
        System.out.println(result);

    }
}
