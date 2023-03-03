package Chap01;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner stdIn1 = new Scanner(System.in);
        Scanner stdIn2 = new Scanner(System.in);

        System.out.println("x와 y까지 사이값의 합을 구합니다.");
        System.out.println("x 값 : ");
        int x = stdIn1.nextInt();
        System.out.println("y 값 : ");
        int y = stdIn2.nextInt();

        int sum = 0;
        if (x > y) {
            for (int i = y; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = x; i <= y; i++) {
                sum+=i;
            }
        }

        System.out.println("정수 x, y 사이의 모든 정수의 총합은 " + sum+ "입니다.");

    }
}
