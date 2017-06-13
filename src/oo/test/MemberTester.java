package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member member = new Member("Alice");
		member.setAge(-5);
		System.out.println(member.getAge());
	}
	
	PhoneMember member2 = new PhoneMember();
	PhoneMember member3 = new PhoneMember("May");

}
