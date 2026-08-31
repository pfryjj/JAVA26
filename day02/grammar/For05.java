package grammar;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		for(int a = 1; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.println(a + " x " + b + " = " + (a * b));
			}
		}
	}
	
}
