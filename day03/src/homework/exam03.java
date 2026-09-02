package homework;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b = 0;
		
		do {
		    System.out.print("숫자 입력: ");
		    a = sc.nextInt();
		    
		    if(a <= 0) {
		    	break;
		    }
		    if(a % 2 == 1) {
		    	continue;
		    }
		    b += a;
		    
		} while(a > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + b);
	}
}