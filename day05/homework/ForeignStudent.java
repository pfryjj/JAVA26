package Person;

public class ForeignStudent extends Student{
	 protected String na;
	 
	 public ForeignStudent(String name, int age, int s_id, String na) {
		 super(name, age, s_id);
		 this.na = na;
	 }
	 public void show() {
		    System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, s_id, na);
		}
}
