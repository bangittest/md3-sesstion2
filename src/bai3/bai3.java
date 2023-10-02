package bai3;
public class bai3 {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 la :");
        for (int number = 2; number < 100; number++) {
            if (isPrive(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean isPrive(int number) {
        if (number <=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number%i==0){
                return false;
            }
        }
    return true;
    }
    
}
