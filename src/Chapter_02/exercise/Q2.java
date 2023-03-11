package Chapter_02.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3, 9, 6, 7};

        int length = a.length;
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과 a[" + (length - i - 1) + "]를 교환합니다.");
            swap(a, i, length - i - 1);
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순 정렬을 마쳤습니다.");

    }

}
