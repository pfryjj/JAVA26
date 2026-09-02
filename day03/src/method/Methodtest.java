package method;

import java.util.Scanner;

public class Methodtest {

	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 12, 8};
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		System.out.println("getMin의 결과값 = " + getMin(numArr));
		System.out.println("getCount의 결과값 = " + getCount(numArr));
		System.out.println("swaArray의 결과값 = " + swapArray(numArr));
		// TODO Auto-generated method stub
		

	}
	public static int getSum (int[] numArr) {
		int sum = 0; 
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		return sum;
	}
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		for(int i = 0; i < numArr.length; i++) {
			if(max >= numArr[i]) {
				continue;
			}
			max = numArr[i];
		}
		
		return max;
	}
	public static int getMin(int[] numArr) {
		int min = numArr[0];
		for(int i = 0; i < numArr.length; i++) {
			if(min <= numArr[i]) {
				continue;
			}
			min = numArr[i];
		}
		
		return min;
	}
	
	public static int getCount(int[] numArr) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < numArr.length; i++) {
			if(a < numArr[i]) {
					count++;
				}
			}
		return count;
	}
	public static String swapArray(int[] arr) {
	    String result = "";
	    for(int i = arr.length - 1; i >= 0; i--) result += arr[i] + " "; 
	    return result;
	}
}