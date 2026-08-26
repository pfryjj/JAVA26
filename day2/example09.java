package homework;

import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("전공 이수 학점 : ");
		int a = sc.nextInt();
		
		System.out.printf("교양 이수 학점 : ");
		int b = sc.nextInt();
		
		System.out.printf("일반 이수 학점 : ");
		int c = sc.nextInt();
		
		if((a + b + c >= 140)&&(a >= 70)&&(b >= 30 && c >= 30 || b + c >= 80)){
			System.out.printf("졸업 가능");
		}else {
			System.out.printf("안됨");
		}
		
	}

}
