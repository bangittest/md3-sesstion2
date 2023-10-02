package th2;

import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so thang trong nam");
        int a=sc.nextInt();
        if (a==2) {
            System.out.println("thang 2 co 28 hoac 29 ngay");
        } else if (a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
            System.out.println("thang"+" "+" "+a+"co 31 ngay");
        }else {
            System.out.println("thang"+a+"co 30 ngay");
        }
    }
}
