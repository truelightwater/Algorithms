package inflearn.String;

import java.util.Scanner;

// 9. 숫자만 추출
public class Numbering {
    public static int solution(String str) {

        int answer=0;
        String upperCase = str.toUpperCase();
        String s = upperCase.replaceAll("[A-Z]", "");
        answer = Integer.parseInt(s);


//        int answer=0;
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) {
//                answer = answer * 10 + (x - 48);
//            }
//        }

//        String answer = "";
//        for (char x : str.toCharArray()) {
//            if (Character.isDigit(x)) {
//                answer+=x;
//            }
//        }
//        return Integer.parseInt(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));

    }
}
