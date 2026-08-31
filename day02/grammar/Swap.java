package grammar;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("변수 1 ");
		int a = sc.nextInt();
		System.out.println("변수 2 ");
		int b = sc.nextInt();
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		
        System.out.println("a = " + a + ", b = " + b);
		
		
	}

}
