package grammar;

import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("금액 : ");
		int a = sc.nextInt();
		
		int count500 = a / 500; 
		int count100 = (a % 500)/100;
		
		System.out.printf("500원 " + count500 + " 100원" + count100);
	}

}
