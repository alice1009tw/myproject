package oo.stati;

public class GraduateStudent extends Student{
	//繼承屬性 但*不繼承建構子*
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
}
