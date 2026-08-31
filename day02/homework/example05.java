package homework;

public class example05 {
    public static void main(String[] args) {
        char c = 'a'; 
        
        char upperC = (char) (c + ((int)'A' - (int)'a'));
        
        System.out.println("소문자: " + c);
        System.out.println("대문자: " + upperC);
    }
}