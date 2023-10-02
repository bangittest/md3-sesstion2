package bai5;
public class bai5 {
    public static void main(String[] args) {
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
