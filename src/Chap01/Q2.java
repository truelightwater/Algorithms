package Chap01;

public class Q2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) b = min;
        if (c < min) c = min;

        return min;
    }
}
