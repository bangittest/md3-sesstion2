package bai4;
public class bai4 {
    public static void main(String[] args) {
        int count = 2;
        int end = 1;
        while (true) {
            if (end == 20){
                System.exit(0);
            }
            if (count == 2) {
                System.out.println("2 là số nguyên tố");
                count++;
                end++;
                continue;
            }
            boolean flag = true;
            for (int i = 2; i < count; i++) {
                if (count % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(count + " là số nguyên tố");
                end++;
            }
            count++;
        }

    }
}

