package animal;

public class Eagle extends Animal{
	@Override
	void eat() {
		System.out.println("고기로 먹는다.");
	}
	void move() {
		System.out.println("날아다닌다.");
	}
	public String toString() {
		System.out.println("고기로 먹는다.");
	}
}
