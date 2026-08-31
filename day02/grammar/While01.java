package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("숫자 입력 : ");
		int a = -1;
		int b = 0;
		
		while(a != 0) {
			a = sc.nextInt();
			b += a;
			
			System.out.println(b);
		}
	}

}
