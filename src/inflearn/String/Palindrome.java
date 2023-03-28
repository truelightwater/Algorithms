package inflearn.String;

import java.util.Scanner;

// 7. 회문 문자열
public class Palindrome {
    public static String solution(String str) {
        String answer = "YES";
        String s = str.toLowerCase();
        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                answer = "NO";
            }
        }

//        String tmp = new StringBuffer(str).reverse().toString();
//        System.out.println(tmp);
//        if (!str.equalsIgnoreCase(tmp)) {
//            answer = "NO";
//        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str =  kb.next();
        System.out.println(solution(str));

    }
}

