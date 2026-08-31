package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = -1;
		int b = 1;
		
		while(b != 0) {
			System.out.printf("숫자 입력 : ");
			a = sc.nextInt();
			if(a % 2 == 0) {
				System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
			System.out.printf("더 하시겠습니까? ");
			b = sc.nextInt();
		}
	}

}
