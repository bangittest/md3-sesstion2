package bai5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=1;
      while (true){
          if (n%5==0 && n%7==0 && n%11==0){
              System.out.println("so nguyen duong chia het cho 5 ,7,11 la:"+ " "+n);
              break;
          }
          n++;

      }
    }
}
