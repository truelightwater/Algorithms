package Chapter_02.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("합의 결과를 알고 싶은 숫자를 입력하는 기능입니다.");


        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("입력할 정수의 갯수를 알려주세요. : ");
        int count = scanner.nextInt();

        do {
            System.out.print("합산할 정수를 입력하세요. : ");
            list.add(scanner.nextInt());
            count--;

        } while (count > 0);


        System.out.println("입력한 배열의 합은 "+list.stream().reduce(0, Integer::sum)+ " 입니다. ");
    }



}
