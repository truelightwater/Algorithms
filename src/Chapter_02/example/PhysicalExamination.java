package Chapter_02.example;

import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21;         // 시력 분포(0.0 ~ 0.1 단위로 21개)

    static class PhysData {
        String name;
        int height;
        double vision;

        // 생성자
        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구함
    static double aveHeight(PhysData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].height;
        }

        return sum / data.length;
    }

    // 시력 분포를 구함
    static void distVision(PhysData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;

        for (i = 0; i < data.length; i++) {
            if (data[i].vision > 0.0 && data[i].vision < VMAX / 10.0) {
                dist[(int) (data[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhysData[] x = {
                new PhysData("강민하", 162, 0.3),
                new PhysData("김찬우", 173, 0.7),
                new PhysData("박준서", 175, 2.0),
                new PhysData("유서범", 171, 1.5),
                new PhysData("이수연", 168, 0.4),
                new PhysData("장경오", 174, 1.2),
                new PhysData("황지안", 169, 0.8),
        };

        int[] vdist = new int[VMAX];        // 시력 분포

        System.out.println("*** 신체검사 리스트 ***");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n 평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);               // 시력 분포를 구함

        System.out.println("\n 시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %1d명\n", i/10.0, vdist[i]);
        }

    }
}
