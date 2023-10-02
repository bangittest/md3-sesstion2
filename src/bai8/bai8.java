package bai8;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("---nhap lua chon:");
            System.out.println("1.hinh tam giac");
            System.out.println("2.Thoat");
            int option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("tinh chu vi dien tich hinh tam giac");
                    System.out.println("nhap canh a cua tam giac");
                    double e=sc.nextDouble();
                    System.out.println("nhap canh b cua tam giac");
                    double g=sc.nextDouble();
                    System.out.println("nhap canh c cua tam giac");
                    double h= sc.nextDouble();
                    if (e>0&&g>0&&h>0){
                        if (e+g>h && e+h>g && g+h>e){
                            double p=(e+g+h)/2;
                            System.out.println("chu vi hinh tam giac la: " + p*2);
                            System.out.println("dien tich hinh tam giac la: " +Math.sqrt(p*(p-e)*(p-g)*(p-h)));
                        }else {
                            System.out.println("k phai tam giac");
                        }
                    }else {
                        System.out.println("k phai tam giac");
                    }
                    break;
                case 2:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
            }
        }
    }
}
