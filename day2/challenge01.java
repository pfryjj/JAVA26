package homework;

import java.util.Scanner;

public class challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("직사각형의 가로 길이를 입력하세요 : ");
		double a = sc.nextDouble();
		
		System.out.printf("직사각형의 세로 길이를 입력하세요 : ");
		double b = sc.nextDouble();

		System.out.printf("직사각형의 넓이는 " + a * b +"입니다");
	}

}
