package Chapter_02.example;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;                        // 찾은 소수의 개수
        int[] prime = new int[500];         // 소수를 저장하는 배열

        prime[ptr++] = 2;                   // 2는 소수

        for (int n = 3; n <= 1000; n += 2) { // 조사대상은 홀수만 진행

            int i;
            for (i = 1; i < ptr; i++) {     // 이미 찾은 소수로 나누어 본다.
                counter++;
                if (n % prime[i] == 0) {    // 나누어 떨어지면 소수가 아님
                    break;                  // 더이상 반복은 불 필요
                }
            }

            if (ptr == i) {                 // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n;           // 소수로 배열에 저장
            }
        }

        for (int i = 0; i < ptr; i++) {      // 찾은 소수의 갯수를 출력
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " +counter);
    }
}
