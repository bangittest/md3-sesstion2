package bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---nhap vao lua chon");
            System.out.println("1 kiem tra tinh chan le");
            System.out.println("2 kiem tra so nguyen to");
            System.out.println("3 kiem tra 1 so co chia het cho 3 khong");
            System.out.println("4 thoat");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("nhap so can kiem tra chan le");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("la so chan");
                    } else {
                        System.out.println("la so le");
                    }
                    break;
                case 2:
                    System.out.println("nhap snt can kiem tra");
                    int num = sc.nextInt();
                    if (num < 2) {
                        System.out.println("khong phai snt");
                    } else {
                        boolean check = true;
                        for (int i = 2; i < num; i++) {
                            if (num % i == 0) {
                                check = false;
                            }
                        }
                        if (check) {
                            System.out.println("la so nguyen to");
                        } else {
                            System.out.println("khong la so nguyen to");
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap so co chia het cho 3 khong");
                    int num_3 = sc.nextInt();
                    if (num_3 % 3 == 0) {
                        System.out.println("chia het cho 3");
                    } else {
                        System.out.println("khong chia het cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ban phai chon cac buoc tren");
                    break;
            }
        }
    }
}
