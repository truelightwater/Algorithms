import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String tmp = "1000011";
        int sum = 0;
        int count = 6;
        for (int i = 0; i < 7; i++) {
            int exp = 0;
            if (tmp.charAt(i) == '1') {
                exp = count - i;
                sum += (int) Math.pow(2, exp);
            }
        }
        System.out.println((char) sum);



    }
}