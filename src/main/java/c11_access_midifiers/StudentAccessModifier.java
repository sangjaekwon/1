package c11_access_midifiers;

/*
    접근지정자: 클래스, 메소드, 필드(변수) 등에 대한 접근 권한을 제어하는 데 사용됨.
    종류:
        1) public: 모든 클래스 접근 가능
        2) protected: 같은 패키지 내의 클래스 및 이 클래스를 상속 받은 자식 클래스에서 접근 가능
        3) default: 접근 지정자를 명시하지 않으면 default로 간주되며, 같은 패키지 내의 클래스내에서만 접근 가능
        4) private: 같은 클랙스 내에서만 접근 가능
 */
public class StudentAccessModifier {
    public StudentAccessModifier() {
    }

    private int studentCode;
    private String studentName;
    private double studentAvg;

    public StudentAccessModifier(double studentAvg) {
        this.studentAvg = studentAvg;
    }

    public StudentAccessModifier(String studentName) {
        this.studentName = studentName;
    }

    public StudentAccessModifier(int studentCode) {
        this.studentCode = studentCode;
    }

    public void setStudentAvg(double studentAvg) {
        if (studentAvg >= 0 && studentAvg <= 100)
            this.studentAvg = studentAvg;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public double getStudentAvg() {
        return studentAvg;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void showInfo() {
        System.out.printf("%s 학생의 학번은 %d이며, 평균 점수는 %.1f점입니다.", studentName, studentCode, studentAvg);
    }

}
