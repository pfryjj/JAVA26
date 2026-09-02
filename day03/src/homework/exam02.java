package homework;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수를 입력하세요 : ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.print("아주 잘했습니다");
			break;
		case 2, 3:
			System.out.print("잘했습니다");
			break;
		case 4, 5, 6:
			System.out.print("보통입니다");
			break;
		default:
			System.out.print("노력하세요");
			break;
		}
		
		
			
	}

}
