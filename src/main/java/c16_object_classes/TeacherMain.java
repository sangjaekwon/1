package c16_object_classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        Class tClass = teacher1.getClass();

        System.out.println(tClass);

        System.out.println(tClass.getSimpleName());

        Field[] fields = tClass.getDeclaredFields();
        for(int i = 0; i <fields.length; i ++ ) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
            System.out.println();
        }
        for(Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
            System.out.println();
        }

        Method[] methods = tClass.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
        }
        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1.getClass() == Teacher.class);
        System.out.println(teacher1.getClass());
        System.out.println(teacher1 instanceof Teacher);

    }
}
