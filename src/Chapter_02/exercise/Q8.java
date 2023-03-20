package Chapter_02.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Q8 {
    int year;
    int month;
    int day;

    public Q8() {
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.day = LocalDate.now().getDayOfMonth();
    }

    @Override
    public String toString() {
        return year + "년 " +
                month + "월 "
                + day + "일 ";
    }

    public int after(int day) {
        int afterDay = this.day + day;

        return afterDay;
    }

    public int before(int day) {
        int beforeDay = this.day - day;

        return beforeDay;
    }


    public static void main(String[] args) {
        Q8 today = new Q8();
        System.out.println("오늘 날짜는 " +today+ " 입니다.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("더하고싶은 날짜를 입력하세요 : ");
        int dayInt = scanner.nextInt();

        int afterDay = today.after(dayInt);
        System.out.print("오늘날짜로 부터 " + dayInt + "일 뒤는 " + afterDay + "일 입니다.");
        System.out.println(" ");

        System.out.print("당기고 싶은 날짜를 입력하세요 : ");
        int dayInt2 = scanner.nextInt();

        int beforeDay = today.before(dayInt2);
        System.out.print("오늘날짜로 부터 " + dayInt2 + "일 앞은 " + beforeDay + "일 입니다.");


    }
}
