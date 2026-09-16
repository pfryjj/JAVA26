package Person;

public class Student extends Person{
	 protected int s_id;
	 
	 public Student(String name, int age, int s_id) {
		 super(name, age);
		 this.s_id = s_id;
	 }
	 public void show() {
		    System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, s_id);
	}
}
