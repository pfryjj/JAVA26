package homework;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("철수 : ");
        String a = sc.next();
        
        System.out.print("영희 : ");
        String b = sc.next();
        
        
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
