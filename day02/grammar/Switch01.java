package grammar;

import java.util.Scanner;

public class Switch01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("숫자 입력 : ");
		int a = sc.nextInt();
		
		switch(a % 2) {
		case 0:
			System.out.printf("짝수");
			break;
		case 1:
			System.out.printf("홀수");
			break;
		}
	}

}
