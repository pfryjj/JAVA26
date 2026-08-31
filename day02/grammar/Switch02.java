package grammar;

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("등급 입력 : ");
		String a = sc.next();
		
		switch(a) {
		case "A":
			System.out.printf("아주 잘하셨어요~~~!!!!");
			break;
		case "C":
			System.out.printf("남들만큼 하셨네요");
			break;
		case "D":
			System.out.printf("조금 더 노력이 필요합니다");
			break;
		case "F":
			System.out.printf("교수실로 찾아오세요");
			break;
		}
	}

}
