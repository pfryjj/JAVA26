package homework;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a * a;
		
		System.out.printf(a + "의 제곱은 " + b);
	}

}
