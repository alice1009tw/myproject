package oo.test;

public class Member {
	String id;
	private int age;
	String name;
	public Member(){
		System.out.println("member construct");
	}

	void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;  //將值傳給屬性
	}

	public int getAge() {
		return age;
	}
}
