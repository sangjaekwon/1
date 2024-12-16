package c18_static;

import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20240000;


    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
        System.out.println(productName + " 제품이 생산되었습니다.");
    }
}
