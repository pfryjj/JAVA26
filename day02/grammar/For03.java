package grammar;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("숫자 입력 : ");
	int a = sc.nextInt();
	for(int b = 1; b <= 9; b++) {
		System.out.println(a + " x "+ b + "= " + a * b);
	}
	
	}
}
