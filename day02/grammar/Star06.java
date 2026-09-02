package grammar;

import java.util.Scanner;

public class Star06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
