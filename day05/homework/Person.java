package Person;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
	    System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}
