package Arrays;

import java.util.Scanner;

public class Array_Multidimensional {
    public static void main(String[] args) {
        //Nhập số cột (row) và số dòng (colum) mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn nhập số hàng cho mảng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn nhập số cột cho mảng");
        int col = Integer.parseInt(sc.nextLine());
        //Khai báo mảng đa chiều
        int[][] array = new int[row][col];
        //Khai báo và khởi tạo giá trị mảng 2 chiều kiểu float
        float[][] array2 = {{5f,8.6f,-4.5f}, {6.4f,8.7f,5.7f}};
        //Nhập giá trị của từng phần tử trong mảng array
        for (int i = 0; i < array.length; i++) {
            //duyệt phần tử cho cột
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Bạn hãy nhập phần tử có chỉ số hàng %d, chỉ số cột %d\n", i,j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        //In giá trị các phần tử theo ma trận
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
