package animal;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {new Tiger(), Goldfish(), new Tiger()};
		for (Animal a : animals) {
			printDayLife(a);
		}
	}
	public static void printDayLife(Animal a){
	System.out.println(a);
	a.eat();
	a.move();
	a.sleep();
	}
}
