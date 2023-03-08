package Chapter_01.exercise;

public class Q15 {

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= n-i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Q15.spira(4);
    }
}
