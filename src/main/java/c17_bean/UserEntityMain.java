package c17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user1 = new UserEntityLombok();
        user1.setUsername("abcdef");
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("권상재");

        //@Data Annotation 내부에는 Setter, Getter, toString() 메소드가 구현되어있다.
        System.out.println(user1.toString());
    }
}
