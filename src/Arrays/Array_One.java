package Arrays;

import java.util.Scanner;

public class Array_One {
    public static void main(String[] args) {
        //1. khai báo mảng số nguyên gồm 5 phần từ
        // Phương thức khai báo Datatype[ ] ArrayName = new Datatype[size];
        int[] numbers = new int[5];
        //2. Khai báo mảng tên sinh viên gồm: Nguyễn Văn A, Nguyễn Văn B, Nguyễn Văn C
        // Phương thức khai báo: Datatype[ ] ArrayName = { value1, value2 , … , valueN }
        String[] names = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        //3. Khởi tạo giá trị các phần tử mảng number
        // Truy cập phần tử arrayName[Chỉ số phần tử]
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        //4. In giá trị các phần tử mảng names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //5. Nhập số phần tử của mảng số nguyên (n) và khai báo mảng số nguyên n phần tử
        // Nhập giá trị của n phần tử
        // In ra phần tử có giá trị chẵn

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị tại vị trí có chỉ số %d\n", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Các phần tử là số chẵn trong mảng là");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.printf("%d\t", array[i]);
            }
        }
    }
}
