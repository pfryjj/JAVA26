package homework;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 1; a <= 20; a++){
			for(int b = a; b <= 20; b++) {
				for(int c = b + 1; c <= 20; c++) {
					if(a + b + c <= 20) {
						if((a * a) + (b * b) == (c * c)) {
							System.out.print("a = " + a + " b = " + b + " c = " + c);
						}
					}
				}
			}
		}
	}
}
