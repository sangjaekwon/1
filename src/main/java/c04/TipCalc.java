package c04;

import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodPrice;
        int percent;
        double percentModified;
        double totalPrice;
        int persons;
        double pricePerPerson;
        String logo = """
                ████████ ██ ██████   ██████  █████  ██       ██████ ██    ██ ██       █████  ████████  ██████  ██████ 
                   ██    ██ ██   ██ ██      ██   ██ ██      ██      ██    ██ ██      ██   ██    ██    ██    ██ ██   ██
                   ██    ██ ██████  ██      ███████ ██      ██      ██    ██ ██      ███████    ██    ██    ██ ██████ 
                   ██    ██ ██      ██      ██   ██ ██      ██      ██    ██ ██      ██   ██    ██    ██    ██ ██   ██
                   ██    ██ ██       ██████ ██   ██ ███████  ██████  ██████  ███████ ██   ██    ██     ██████  ██   ██                                                                                                       \s
                """;
        System.out.println(logo);
        System.out.println("음식 가격 -> ");
        foodPrice = scanner.nextInt();
        System.out.println("몇 %의 팁을 내기를 원하나요? 10, 12, 15 중 하나 선택 -> ");
        percent = scanner.nextInt();
        percentModified = percent / 100.0;
        System.out.println("percentModified = " + percentModified);

        totalPrice = foodPrice + (foodPrice * percentModified);
        System.out.println("총 가격은 " + totalPrice + "입니다.");

        System.out.println("몇 명에서 나누나요");
        persons = scanner.nextInt();
        pricePerPerson = totalPrice / persons;
        System.out.printf("1인당 지불해야 하는 금액은 %.0f원입니다.", pricePerPerson);

    }
}
