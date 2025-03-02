package Btvn;

import java.util.Scanner;

public class Exercise_Them {
    public static void main(String[] args) {
        //1. Nhập số phần tử, khởi tạo và khai báo mảng số nguyên
        //2. tìm giá trị lớn thứ 2 trong mảng và chỉ ra vị trí
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int[] check = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ",i);
            arr[i] = Integer.parseInt(sc.nextLine());
            check[i] = arr[i];
        }
        System.out.println("Mảng của bạn là");
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();

        //Tìm giá trị lớn thứ 2 và chỉ ra các vị trí

        // Cách tự nghĩ

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }

        int[] subtractionResults = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            subtractionResults[i] = max - arr[i];
        }

        int min = 0;
        for (int i = 0; i < subtractionResults.length; i++) {
            if (subtractionResults[i]>0) {
                min = subtractionResults[i];
                break;
            }
        }

        if (min == 0) {
            System.out.printf("mảng bạn đã cho không có giá trị lớn thứ 2\n");
        } else {
            int max2 = 0;
            for (int i = 0; i < subtractionResults.length; i++) {
                if (subtractionResults[i]<min && subtractionResults[i] != 0) {
                    min = subtractionResults[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (subtractionResults[i] == min) {
                    max2 = arr[i];
                }
            }
            System.out.printf("Giá trị lớn thứ 2 của mảng là %d tại các vị trí:\n",max2);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max2) {
                    System.out.printf("arr[%d]\t",i);
                }
            }
        }

        // Cách được gợi ý
        //sắp xếp mảng giảm dần

        int n1 = 0;
        for (int i = 0; i < check.length; i++) {
            for (int j = i+1; j < check.length; j++) {
                if (check[i]<check[j]) {
                    n1 = check[i];
                    check[i] = check[j];
                    check[j] = n1;
                }
            }
        }

        n1 = check[0];

        for (int i = 1; i < check.length; i++) {
            if (check[i] != n1) {
                n1 = check[i];
                break;
            }
        }

        if (n1 != check[0]) {
            System.out.printf("Giá trị lớn thứ 2 là %d, tại các vị trí\n", n1);
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] == n1) {
                    System.out.printf("arr[%d]\t", i);
                }
            }
        } else {
            System.out.printf("mảng bạn đã cho không có giá trị lớn thứ 2\n");
        }

    }
}
