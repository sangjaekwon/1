package c09_classes;

public class Product {
    int productNum;
    String productName;

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    public Product(int productNum) {
        this.productNum = productNum;
    }

    void showInfo() {
        System.out.printf("해당 제품의 시리얼 넘버는 %d이고,\n제품명은 %s입니다", productNum, productName);
    }

}
