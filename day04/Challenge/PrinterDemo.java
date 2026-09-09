package homework;

public class PrinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
