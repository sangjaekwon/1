package c18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {
    private String name;



    public static void main(String[] args) {
        System.out.println("현재 시리얼 넘버: " +Product.autoIncrement);
        Product product1 = new Product("p1");

        System.out.println("현재 시리얼 넘버: " +Product.autoIncrement);

        System.out.println("p1의 시리얼 넘버: " + product1.getSerialNumber());

        Product product2 = new Product("p2");

        System.out.println("현재 시리얼 넘버: " +Product.autoIncrement);
        System.out.println("p2의 시리얼 넘버: " + product2.getSerialNumber());

        ProductMain productMain1 = new ProductMain();

        productMain1.setName("pm1");
        System.out.println(productMain1.getName());
    }
}
