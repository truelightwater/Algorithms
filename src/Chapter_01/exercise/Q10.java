package Chapter_01.exercise;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("입력한 숫자의 자리수를 출력합니다.");

        int n;
        do {
            System.out.println("n 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
    }

}
