package c13_inheritance.Product;

public class Item {
    private String name;
    private String category;

    public Item() {
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Item(String name, String category) {
        System.out.println("Item 생성");
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }
}
