package homework;

public class exam02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "cccccccc";
		char search = 'c';
		int result = countChar(test, search);
		
		System.out.print(test + "에서 c의 개수는" + result + "입니다");
		
	}
	public static int countChar(String s, char c) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == c) {
					count += 1;
				}
			}
		return count;
	}
}
