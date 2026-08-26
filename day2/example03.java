package homework;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("원기둥의 밑면 반지름은? : ");
		double a = sc.nextDouble();
		
		System.out.printf("원기둥의 높이는? : ");
		double b = sc.nextDouble();
		
		double c = 3.14 * (a*a) * b;
		
		System.out.printf("원기등의 부피는 " + c);
	}

}
