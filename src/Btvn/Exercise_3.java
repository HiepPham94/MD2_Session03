package Btvn;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        //Trong phần này, chúng ta sẽ phát triển một chương trình cho phép gộp 2 mảng trở thành một mảng thứ 3
        //Chương trình cho phép người dùng nhập giá trị cho các phần tử trong 2 mảng số nguyên cho trước
        //Mảng số nguyên thứ 3 được khai báo có kích thước bằng kích thước của 2 mảng só nguyên đã cho cộng lại với nhau
        //Mảng này sẽ chứa các phần tử trong mảng 1 và 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử có trong mảng 1");
        int n1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n1];
        System.out.println("Hãy Nhập số phần tử có trong mảng 2");
        int n2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[n2];

        //Nhập giá trị cho mảng 1

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Nhập giá trị phần tử tại arr1[%d]: ", i);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng 1 của bạn là");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d\t", arr1[i]);
        }
        System.out.println();

        // Nhập giá trị cho mảng 2

        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Nhập giá trị phần tử tại arr2[%d]: ", i);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng 2 của bạn là");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d\t", arr2[i]);
        }
        System.out.println();

        // Gộp 2 mảng vào mảng 1 chiều

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        System.out.println("Mảng sau gộp là");
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d\t", arr3[i]);
        }
        System.out.println();

        // Gộp 2 mảng vào mảng 2 chiều
        int[][] arr4;
        if (arr1.length > arr2.length) {
            arr4 = new int[2][arr1.length];
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    for (int j = 0; j < arr1.length; j++) {
                        arr4[i][j] = arr1[j];
                    }
                } else {
                    for (int j = 0; j < arr2.length; j++) {
                        arr4[i][j] = arr2[j];
                    }
                }
            }
        } else {
            arr4 = new int[2][arr2.length];
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    for (int j = 0; j < arr1.length; j++) {
                        arr4[i][j] = arr1[j];
                    }
                } else {
                    for (int j = 0; j < arr2.length; j++) {
                        arr4[i][j] = arr2[j];
                    }
                }
            }
        }
        System.out.println("Mảng sau khi gộp là");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.printf("%d\t", arr4[i][j]);
            }
            System.out.println();
        }
    }
}
