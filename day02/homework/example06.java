package homework;

import java.util.Scanner;

public class example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("화씨 온도를 입력하시오 : ");
		double f = sc.nextDouble();
		
		double c = (f - 32)/ 1.8;
		
		System.out.printf("섭씨 온도 " + c);
	}

}
