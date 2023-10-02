package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start;
        System.out.println("nhap so start: ");
        start = sc.nextDouble();
        double end;
        System.out.println("nhap so end: ");
        end = sc.nextDouble();
        int sum = 0;
        for (double i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println("so chan " + i);
            }
        }
        System.out.println("ket qua: " + sum);
    }
}
