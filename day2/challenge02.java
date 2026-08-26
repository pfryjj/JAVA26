package homework;

import java.util.Scanner;

public class challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.printf("짝수입니다");
		}
		else{
			System.out.printf("홀수입니다");
		}
	}
}

