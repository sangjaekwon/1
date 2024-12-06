package c12_arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++num;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
