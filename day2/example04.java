package homework;

import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("초 단위 정수를 입력하세요 : ");
		int total = sc.nextInt();
	
		int s = total % 60;
		int m = (total % 3600) /60;
		int h = total / 3600;
		
		System.out.printf(h + "시간 " + m + "분 " + s + "초");
		
	}

}
