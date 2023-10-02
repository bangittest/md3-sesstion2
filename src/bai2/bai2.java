package bai2;
public class bai2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("* * * * * * * ");
        }
        //tam giac
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }

        //tam giac vuong
        for (int i = 7; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println();
        }

        //tam giac can
        for (int i = 1; i <= 5; i++) {
            // In các khoảng trắng phía trước
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // In các ký tự '*' cho mỗi hàng
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau khi in xong mỗi hàng
            System.out.println();
        }

    }
}
