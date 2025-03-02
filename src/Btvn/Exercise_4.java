package Btvn;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        //Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực

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

        //tìm giá trị lớn nhất

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>=max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất của mảng là: %d, tại các vị trí:\n", max);

        // tìm ra tọa độ cũng như giá trị của phần tử lớn nhất

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==max) {
                    System.out.printf("arr[%d][%d]\t", i, j);
                }
            }
        }
    }
}
