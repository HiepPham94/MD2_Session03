package Btvn;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        /*
         *Nhập vào số phần t của mảng 1 chiều số nguyên
         * Nhập giá trị các phần tử của mảng
         * nhập chỉ số phần tử cần xóa
         * xóa phần tử theo chỉ số mảng
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị cho phần tử có chỉ số %d: \n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        do {
            System.out.println("Nhập chỉ số phần tử bạn muốn xóa?");
            int del = Integer.parseInt(sc.nextLine());
            if (del < arr.length && del >= 0) {
                int[] newArr = new int[arr.length - 1];
                for (int i = 0; i < newArr.length; i++) {
                    if (i < del) {
                        newArr[i] = arr[i];
                    } else {
                        newArr[i] = arr[i + 1];
                    }
                }
                for (int i = 0; i < newArr.length; i++) {
                    System.out.printf("%d ", newArr[i]);
                }
                break;
            } else {
                System.err.printf("Nhập chỉ số từ 0 - %d\n", arr.length - 1);
            }
        } while (true);
    }
}
