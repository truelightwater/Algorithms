package inflearn.Array;

import java.util.Scanner;

/* 자연수 N이 입력되면 1부터 N 까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
   만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개 입니다.
 * */
public class Decimal {

    public static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <=n; j += i) {
                    ch[j]=1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(solution(n));
    }
}
