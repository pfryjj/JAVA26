package homework;

public class PrinterTest {

    public static void main(String[] args) {
        Printer p = new Printer(10);
        
        p.print(2);
        p.print(20);
        p.print(10);
        
        System.out.println("남아있는 용지: " + p.getpaper());
    }
}