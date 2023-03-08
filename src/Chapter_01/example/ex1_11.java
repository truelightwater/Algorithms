package Chapter_01.example;

import java.util.Scanner;

public class ex1_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지 합을 구합니다.");

        do {
            System.out.println("n 값 :");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.println(n+ " = " + (sum += n));

    }
}
