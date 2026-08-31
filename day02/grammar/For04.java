package grammar;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int a = sc.nextInt();
		
		while(a < 0) {
			System.out.printf("양수가 아닙니다 다시 입력하세요 : ");
			a = sc.nextInt();
		}
		
		int temp = 0;	

		for(int i = 1; i <= a; i++) {
			temp += i;
		}
		System.out.println("1부터 " + a + "까지의 합은 " + temp + "입니다.");		
	}
}

