package c12_arrays;

/*
    일반 변수: 데이터를 직접 가지는 변수
        byte, short, int, double
    참조 변수: 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나 변경하는 경우
        String, 배열, 객체(클래스), Collections
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[3] = 400;
        arr[2] = 300;
        arr[4] = 500;
        int[] arr2 = {1, 2, 3, 4, 5};
//
//        System.out.println(arr);
//        System.out.println(arr2);

        //String은 기본 자료형이 아니라 클래스이기 때문에 실제로는 객체 생성을 통해 데이터를 삽입한다는 근거:
//        String strExample = new String("안녕하세요");
//        System.out.println(strExample);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
