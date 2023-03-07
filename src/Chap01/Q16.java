package Chap01;

public class Q16 {
    static void nspira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n-i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Q16.nspira(4);
    }

}
