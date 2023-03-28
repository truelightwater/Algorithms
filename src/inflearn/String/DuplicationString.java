package inflearn.String;

import java.util.Scanner;

// 6. 중복 문자 제거
public class DuplicationString {
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
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

