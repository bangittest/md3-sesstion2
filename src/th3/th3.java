package th3;

import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("nhap nam can kiem tra");
        year=sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("la nam nhuan " +year);
                }else {
                    System.out.println("khong la nam nhuan");
                }

            }else {
                System.out.println("la nam nhuan " +year);
            }
        }else {
            System.out.println("la nam nhuan " +year);
        }
    }
}
