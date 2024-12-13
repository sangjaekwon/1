package c10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("권상재");
        Person person3 = new Person(-100);
        Person person4 = new Person("아아아", 10000);

        person3.setAge(20300);
        person4.setName("김삼");
        person4.setAge(30);

        System.out.println(person3.getAge());
        System.out.println(person4.getName());
        System.out.println(person4.getAge());
    }

}
