package Btvn;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        //Trong phần này, chúng tôi sẽ phát triển một chương trình
        // cho phép người dùng khai báo mảng số nguyên bao gồm N phần tử.
        // Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn,
        // giá trị này sẽ được chèn vào vị trí đó trong mảng.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Hãy nhập giá trị tại vị trí %d: ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng của bạn là");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        do {
            System.out.println("Nhập vị trí bạn cần chèn (chỉ số Index)");
            int check = Integer.parseInt(sc.nextLine());
            int[] newArr = new int[arr.length+1];
            if (check >= 0 && check < arr.length) {
                for (int i = 0; i < newArr.length; i++) {
                    if (i <check) {
                        newArr[i]=arr[i];
                    } else if (i==check){
                        System.out.println("Bạn hãy nhập giá trị phần tử chèn");
                        newArr[i]=Integer.parseInt(sc.nextLine());
                    } else {
                        newArr[i]=arr[i-1];
                    }
                }
                System.out.println("Mảng của bạn là");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.printf("%d\t", newArr[i]);
                }
                System.out.println();
                break;
            } else {
                System.err.printf("Nhập vị trí từ 0 - %d\n", arr.length-1);
            }
        } while (true);
    }
}
