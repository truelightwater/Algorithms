package Chapter_02.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    static void copy(int[] a, int[] b) {
        System.out.println("b의 배열 초기값은 " + Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
        System.out.println("복사한 a의 배열값은 " +Arrays.toString(a) + " 입니다.");
    }





    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수는  : ");
        int num = stdIn.nextInt();		// 요솟수

        int[] a = new int[num];			// 요솟수가 num 인 배열
        int[] b = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        copy(a, b);
    }

}
