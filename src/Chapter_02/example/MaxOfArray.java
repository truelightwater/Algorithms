package Chapter_02.example;

import java.util.Scanner;

public class MaxOfArray {

    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("키가 제일 큰 사람을 구합니다.");

        System.out.println("사람의 수 : ");
        int num = scanner.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "] :");
            height[i] = scanner.nextInt();
        }

        System.out.println("제일 큰 키는 " +maxOf(height)+ " 입니다.");
    }
}
