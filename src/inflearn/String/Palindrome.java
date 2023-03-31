package inflearn.String;

import java.util.Scanner;

// 7. 회문 문자열
    /*
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    단 회문을 검사할 때 대소문자를 구분하지 않습니다.
    */
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

