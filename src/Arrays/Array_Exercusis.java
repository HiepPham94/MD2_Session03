package Arrays;

import java.util.Scanner;

public class Array_Exercusis {
    public static void main(String[] args) {
        //Nhập số phần tử của mảng và khai báo mảng số nguyên gồm n phần tử
        //In menu và thực hiện các chức năng theo menu
        //1. Nhập giá trị các phần tử
        //2. in giá trị các phần tử
        //3. Tính tổng giá trị các phần tử
        //4. In các phần tử có giá trị lẻ
        //5. in các phần tử có chỉ số chẵn
        //6. Sắp xếp giá trị tăng dần
        //7. thoát
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn hãy nhập số phần tử mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        do {
            System.out.println("*********************** Menu ********************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. in giá trị các phần tử");
            System.out.println("3. Tính tổng giá trị các phần tử");
            System.out.println("4. In các phần tử có giá trị lẻ");
            System.out.println("5. in các phần tử có chỉ số chẵn");
            System.out.println("6. Sắp xếp giá trị tăng dần");
            System.out.println("7. thoát");
            System.out.println("Bạn chọn chức năng?");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("Bạn nhập giá trị cho phần tử có chỉ số %d: ", i);
                        array[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử là:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("%d\t", array[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    int number = 0;
                    for (int i = 0; i < array.length; i++) {
                        number += array[i];
                    }
                    System.out.printf("Tổng giá trị các phần tử là %d", number);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị lẻ là:");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 != 0) {
                            System.out.printf("%d\t", array[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số chẵn là:");
                    for (int i = 0; i < array.length; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", array[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    int a;
                    for (int i = 0; i < array.length-1; i++) {
                        for (int j = i +1 ; j < array.length; j++) {
                            if (array[j]<array[i]) {
                                a = array[i];
                                array[i] = array[j];
                                array[j] = a;
                            }
                        }
                    }
                    System.out.println("Giá trị các phần tử sau sắp xếp là:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("%d\t", array[i]);
                    }
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Chọn chức năng từ 1-7");
            }
        } while (true);
    }
}
