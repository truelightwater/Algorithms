package inflearn.String;

import java.util.Scanner;

// 11. 문자열 압축
public class CompressionString {
    public static String solution(String str) {
        String answer = "";

        str = str + " ";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str =  kb.next();
        System.out.println(solution(str));

    }
}

