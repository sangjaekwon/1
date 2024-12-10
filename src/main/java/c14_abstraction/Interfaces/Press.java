package c14_abstraction.Interfaces;

public interface Press {
    //public static final String NAME = "button";
    String NAME = "button"; // 인터페이스에서 선언된 필드는 모두 상수

    //    private String name;
//    public Press();
//    public void pop() {}
    // 변수, 생성자, 일반 메소드 불가능;
    void onPressed();
}
