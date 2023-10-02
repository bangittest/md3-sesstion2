package th1;

import java.util.Scanner;

public class bth1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        double a=sc.nextDouble();
        System.out.println("nhap b");
        double b=sc.nextDouble();
        System.out.println("nhap c");
        double c=sc.nextDouble();
        if (a !=0) {
            double x=(c-b)/a;
            System.out.println("pt co 1 nghiem:" +" " +x);
        }else {
            if (b==c){
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
