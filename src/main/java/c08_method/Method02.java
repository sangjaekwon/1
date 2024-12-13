package c08_method;

import java.util.Scanner;

public class Method02 {

    public static String getStar(int menuSelect, int totalLine) {
        String result = "";

        if(menuSelect == 1) { // 왼쪽 증가
            for(int i=0 ; i < totalLine ; i++) {
                for(int j=0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if(menuSelect == 2) { // 오른쪽 증가
            for(int i=0 ; i < totalLine ; i++) {
                for(int k=0; k< totalLine -i -1 ; k++) {
                    result += " ";
                }
                for(int j=0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 3) { //왼 감소
            for(int i=0 ; i < totalLine ; i++) {
                for(int j= totalLine-i; j > 0; j--) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (menuSelect == 4) { // 오른 감소
            for(int i=0 ; i < totalLine ; i++) {
                for(int k=0; k < i ; k++) {
                    result += " ";
                }
                for(int j=totalLine-i; j > 0; j--) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "잘못된 입력";
        }


        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice = 0;



        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴 선택 -> ");
        choice = scanner.nextInt();
        while(choice > 4 || choice < 1) {
            System.out.println("다시 메뉴를 선택하세요 -> ");
            choice = scanner.nextInt();
        }

        System.out.print("별 줄 수 입력 -> ");
        rowOfStars = scanner.nextInt();

        System.out.println("[결과]");
        String stars = getStar(choice, rowOfStars);
        System.out.println(stars);
    }
}
