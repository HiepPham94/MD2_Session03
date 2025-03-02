package Arrays;

import java.util.Scanner;

public class UD {
    public static void main(String[] args) {
        /* Xây dựng ứng dụng
        * Nhập số dòng, cột mảng đa chiều số nguyên và khởi tạo mảng
        * in Menu và thực hiện các chức năng
        * 1. Nhập giá trị các phần tử
        * 2. In các giá trị phần tử theo ma trận
        * 3. In giá trị các phần tử nằm ở biên ma trận
        * 4. Tính tổng các phần tử chia hết cho 3 trong mảng
        * 5. In các phần tử trên đường chéo chính và đường chéo phụ trong mảng
        * 6. Sắp sếp các dòng phần tử có giá trị giảm dần
        * 7. Thoát
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột cho mảng");
        int col = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[row][col];
        do {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. In các giá trị phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm ở biên ma trận");
            System.out.println("4. Tính tổng các phần tử chia hết cho 3 trong mảng");
            System.out.println("5. In các phần tử trên đường chéo chính và đường chéo phụ trong mảng");
            System.out.println("6. Sắp sếp các dòng phần tử có giá trị giảm dần");
            System.out.println("7. Thoát");
            System.out.println("Sự lựa chọn của bạn là");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("Nhập giá trị tại matrix[%d][%d]: ",i,j);
                            matrix[i][j]=Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t",matrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0 || i == matrix.length -1) {
                                System.out.printf("%d\t",matrix[i][j]);
                            } else if (j == 0 || j == matrix[i].length-1) {
                                System.out.printf("%d\t",matrix[i][j]);
                            } else {
                                System.out.printf(" \t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                           if (matrix[i][j]%3==0) {
                               sum = sum + matrix[i][j];
                           }
                        }
                    }
                    System.out.println("Tổng các phần tử có giá trị chia hết cho 3 là: " +sum);
                    break;
                case 5:
                    if (row != col) {
                        System.out.println("mảng của bạn không có chéo chính, phụ");
                    } else {
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (i == j || i+j == row-1) {
                                    System.out.printf("%d\t",matrix[i][j]);
                                } else {
                                    System.out.printf(" \t");
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    int secondary;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            for (int k = j+1; k < matrix[i].length; k++) {
                                if (matrix[i][j]<matrix[i][k]) {
                                    secondary = matrix[i][j];
                                    matrix[i][j] = matrix[i][k];
                                    matrix[i][k] = secondary;
                                }
                            }
                        }
                    }
                    System.out.println("mảng sau khi được sắp xếp");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("%d\t",matrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Chọn chức năng từ 1 - 7");
            }
        } while (true);
    }
}
