public class Main {
    public static void main(String[] args) {
        String cipher = "pfqallllabwaoclk";
        int code = 2;
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        System.out.println(answer);


    }
}