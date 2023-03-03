package Chap01;

import java.util.Scanner;

public class Q4 {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return  a;
            } else return c;
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else return b;

    }


    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.println("a의 값 : ");
        int a = stdId.nextInt();
        System.out.println("b의 값 : ");
        int b = stdId.nextInt();
        System.out.println("c의 값 : ");
        int c = stdId.nextInt();

        System.out.println("med3(a,b,c) = " + med3(a, b, c));
    }
}
