package grammar;

import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            // 공백 출력: (num - i)개
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 별 출력: 홀수 개씩 증가 (1, 3, 5...)
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}