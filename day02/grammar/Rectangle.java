package grammar;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 길이");
		double a = sc.nextInt();
		
		System.out.println("세로 길이");
		double b = sc.nextInt();
		
		double c = a * b;
		
		System.out.printf("%.1f", c);
		
	}

}
