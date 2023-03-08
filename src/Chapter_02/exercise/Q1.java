package Chapter_02.exercise;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

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
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("키가 제일 큰 사람을 구합니다.");
        int num = 1 + rand.nextInt(9);
        System.out.println("사람의 수 : " +num);

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("제일 큰 키는 " +maxOf(height)+ " 입니다.");
    }
}
