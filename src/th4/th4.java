package th4;

import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("ban nhap can nang(kg):");
        weight=sc.nextDouble();
        System.out.println("nhap chieu cao");
        height=sc.nextDouble();
        bmi= weight/(height*height);
        if (bmi<18){
            System.out.println(bmi +"gay");
        } else if (bmi<25.0) {
            System.out.println(bmi+"binh thuong");
        } else if (bmi<30.0) {
            System.out.println(bmi+"hoi beo");
        }else {
            System.out.println("beo");
        }
    }

}
