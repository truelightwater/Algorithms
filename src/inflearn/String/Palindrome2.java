package inflearn.String;

import java.util.Scanner;

// 8. 유효한 팰린드롬
public class Palindrome2 {
    public static String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str =  kb.nextLine();
        System.out.println(solution(str));

    }
}

