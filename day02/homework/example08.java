package homework;

import java.util.Scanner;

public class example08 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int number = in.nextInt();

        int h = number / 100;
        int t = (number % 100) / 10;
        int o = number % 10;

        int sum = h + t + o;

        System.out.println("각 자릿수의 합 = " + sum);
    }

}