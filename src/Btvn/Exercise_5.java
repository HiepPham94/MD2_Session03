package Btvn;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {

        //Phát triển một chương trình cho phép người dùng khai báo
        // một mảng số nguyên với các giá trị trong mảng được khởi tạo sẵn hoặc được nhập từ bàn phím.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng của ma trận");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số cột của ma trận");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập giá trị tại vị trí arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        //In ra ma trận

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }

        //Hiển thị giá trị nhỏ nhất trong mảng đó ra màn hình

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.printf("Giá trị nhỏ nhất của mảng là %d tại vị trí: \n", min);

        //Hiển thị vị trí

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == min) {
                    System.out.printf("arr[%d][%d]\t", i, j);
                }
            }
        }
    }
}
