package Chap01;

public class Q14 {

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
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i - 1) != 0) {
                System.out.print(" ".repeat(i-1));
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void triangleRB(int n) {
        int count = n-1 ;

        for (int i = 1; i <= n; i++) {
            if ((count) != 0) {
                System.out.print(" ".repeat(count));
                count--;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(4);
        triangleLB(5);
        triangleRU(4);
        triangleRB(4);

    }
}
