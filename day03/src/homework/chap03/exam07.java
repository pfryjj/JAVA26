package homework;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = input("철수");
		String b = input("영희");
		whoWin(a, b);
	}
	public static String input(String name) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print(name + " : ");
	String rsp = sc.next();
	return rsp;
}
	public static void whoWin(String a, String b) {
	      if(a.equals(b)) {
	        	System.out.print("무승부입니다");
	        }else {
	        	if((a.equals("s") && b.equals("p")) || (a.equals("r") && b.equals("s")) || (a.equals("p") && b.equals("r"))){
	        		System.out.print("철수 승");
	        	}else {
	        		System.out.print("영희 승");
	        	}
	       }
	}
}
