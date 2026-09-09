package homework;

public class Member {

	private String name = "";
	private String id = "";
	private String pass = "";
	private int age = 0;

public Member(String name, String id, String pass, int age) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pass;
	}
	public int getAge() {
		return age;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pass) {
		this.pass = pass;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
