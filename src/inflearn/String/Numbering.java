package inflearn.String;

import java.util.Scanner;

// 9. 숫자만 추출
    /*문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
    만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
    */
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
