import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        String str;
        System.out.println("num입력");
        num = input.nextInt();

        System.out.println("str입력");
        str = input.next();

        System.out.println("num : " + num);
        System.out.println("str : " + str);
        input.close();

    }
}