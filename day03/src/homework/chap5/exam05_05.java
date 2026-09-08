package homework;

import java.util.Scanner;

public class exam05_05 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] b = new int[10];

        System.out.println("숫자를 10개 입력하세요.");
        
        for (int i = 0; i < 10; i++) {
            int c = a.nextInt();
            if (c >= 0 && c <= 99) {
                b[c / 10]++;
            }
        }

        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ~ %2d : ", i * 10, i * 10 + 9);
            for (int j = 0; j < b[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
