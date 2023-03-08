package Chapter_01.exercise;

public class Q1 {

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) b = max;
        if (c > max) c = max;
        if (d > max) d = max;
        return max;
    }
}
