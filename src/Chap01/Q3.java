package Chap01;

public class Q3 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) b = min;
        if (c < min) c = min;
        if (d < min) d = min;

        return min;
    }
}
