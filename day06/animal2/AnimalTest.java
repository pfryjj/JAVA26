package animal2;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayLife(new Tiger());
	}
	public static void printDayLife(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}

}
