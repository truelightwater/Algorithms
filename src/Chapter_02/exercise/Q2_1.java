package Chapter_02.exercise;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Scanner;

public class Q2_1 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]을 교환합니다.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 정수의 갯수는 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" +i+ "] :");
            x[i] = scanner.nextInt();
        }

        reverse(x);

        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
