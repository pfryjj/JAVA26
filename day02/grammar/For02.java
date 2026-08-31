package grammar;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int b = 0;
		
		
		for(int a = 0; a <= 4; a++) {
			b = sc.nextInt();
			temp += b;
		}
		System.out.printf("5개의 숫자 더한 값 :" + temp);
	}

}
