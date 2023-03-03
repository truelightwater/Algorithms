package Chap01;

public class Q14_1 {

    static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        triangle(4);
//        triangleLB(4);
//        triangleRU(4);
        triangleRB(4);

    }
}
