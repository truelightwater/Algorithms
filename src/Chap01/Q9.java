package Chap01;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int b;
        int a;

        System.out.println("b에서 a값을 뺀 나머지를 구합니다.");

        System.out.println("a 값 :");
        a = stdIn.nextInt();

        while (true) {
            System.out.println("b 값 :");
            b = stdIn.nextInt();
            if (b > a) break;
        }

        int value = b-a;

        System.out.println("b에서 a값을 뺀 나머지 값은 " +value+ "입니다. ");

    }
}
