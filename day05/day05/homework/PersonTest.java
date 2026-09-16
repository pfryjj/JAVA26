package Person;

import Girl.BestGirl;
import Girl.Girl;
import Girl.GoodGirl;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person = {
				new Person("길동이", 22),
				new Student("황진이", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A")
				};
		
		for(Person p : person)
			p.show();
	
	}

}
